package dw.controller;

import dw.model.Order;
import dw.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getOrderAll() {
        return new ResponseEntity<>(orderService.getOrderAll(),
                HttpStatus.OK);
    }

//    @GetMapping("/orders/date/after/{date}")
//    public ResponseEntity<List<Order>> getOrderByDateAfter(@PathVariable @DateTimeFormat LocalDate date) {
//        return new ResponseEntity<>(orderService.getOrderByDateAfter(date),
//                HttpStatus.OK);
//    }
}