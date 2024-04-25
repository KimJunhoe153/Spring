package dw.controller;

import dw.model.Product;
import dw.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProductAll() {
        return new ResponseEntity<>(productService.getProductAll(),
                HttpStatus.OK);
    }

    @GetMapping("/products/inventory/under/{num}")
    public ResponseEntity<List<Product>> getProductByInventoryUnder(@PathVariable int num) {
        return new ResponseEntity<>(productService.getProductByInventoryUnder(num),
                HttpStatus.OK);
    }

    @GetMapping("/porducts/idlist")
    public ResponseEntity<List<Product>> getProductByIdWithList(@RequestBody List<Long> idList) {
        return new ResponseEntity<>(productService.getProductByIdWithList(idList),
                HttpStatus.OK);
    }

    @GetMapping("/products/inventoryprice/")
    public ResponseEntity<List<Product>> getProductByTopPrice(@RequestBody List<Long> unitPriceList) {
        return new ResponseEntity<>(productService.getTopProductsByInventoryValue(unitPriceList),
                HttpStatus.OK);
    }
}