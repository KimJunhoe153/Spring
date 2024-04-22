package dw.gameshop.controller;

import dw.gameshop.model.Game;
import dw.gameshop.model.Purchase;
import dw.gameshop.service.GameShopService;
import dw.gameshop.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // 웹에 들어오는 요청을 컨트롤학기 위해 이 메소드를 사용할 것임을 알리는 플래그
public class PurchaseController {
    @Autowired // 객체에 대한 읜존성을 주입
    PurchaseService purchaseService;
    @Autowired
    GameShopService gameShopService;

    @PostMapping("/products/purchase") // Post 메서드에 Controller의 메서드를 매핑
    public Purchase savePurchase(@RequestBody Purchase purchase) {
        return purchaseService.savePurchase(purchase);
    }

    @GetMapping("/products/purchase") // Get 메서드에 Controller의 메서드를 매핑
    public List<Purchase> getAllPurchases() {
        return purchaseService.getAllPurchases();
    }

    @GetMapping("/products/purchase/{userId}")// "
    public List<Purchase> getPurchaseListByUser(@PathVariable String userId) {
        return purchaseService.getPurchaseListByUser(userId);
    }

    @GetMapping("/products/purchase/name/{userName}")
    public ResponseEntity<List<Purchase>> getPurchaseListByUserName(
            @PathVariable String userName) {
        return new ResponseEntity<>(purchaseService.getPurchaseListByUserName(userName),
                HttpStatus.OK);
    }

}