package dw.gameshop.controller;

import dw.gameshop.model.Purchase;
import dw.gameshop.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PurchaseContrallor {
    PurchaseService purchaseService;

    public PurchaseContrallor(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }
}

@PostMapping("/products/purchase")
public Purchase savePurchase(@RequestBody Purchase purchase) {
    return purchaseService.savePurchase(purchase);
}

@GetMapping("/products/purchase")
public List<Purchase> getAllPurchases() {
    return purchaseService.getAllPurchases();
}

@GetMapping("/products/purchase/{userId}")
public List<Purchase> getPurchaseListById(@PathVariable String userId) {
    return purchaseService.getPurchaseByUser(userId);
}