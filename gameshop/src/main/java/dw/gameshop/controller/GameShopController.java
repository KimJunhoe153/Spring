package dw.gameshop.controller;

import dw.gameshop.model.Game;
import dw.gameshop.model.User;
import dw.gameshop.service.GameShopService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameShopController {
    GameShopService gameShopService;

    public GameShopController(GameShopService gameShopService) {
        this.gameShopService = gameShopService;
    }

    @GetMapping("/products")
    public List<Game> getAllGames() {
        return gameShopService.getAllGames();
    }

    @GetMapping("/products/{id}")
    public Game getGameById(@PathVariable long id) {
        return gameShopService.getGameById(id);
    }

    @PutMapping("/products/{id}")
    public Game updateGameById(@PathVariable long id,
                               @RequestBody Game game) {
        return gameShopService.updateGameById(id, game);
    }

    @PostMapping("products/user")
    public User saveUser(@RequestBody User user) {
        return gameShopService.saveUser(user);
    }

    @GetMapping("/products/maxprice")
    public ResponseEntity<Game> getGameWithMaxPrice() {
        return new ResponseEntity<>(gameShopService.getGameWithMaxPrice(),
                HttpStatus.OK);
    }

    @GetMapping("/products/maxpricetop3")
    public ResponseEntity<List<Game>> getGameWirhMaxPriceTop3() {
        return new ResponseEntity<>(gameShopService.getGameWithMaxPriceTop3(),
                HttpStatus.OK);
    }
}
