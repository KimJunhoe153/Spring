package dw.controller;

import dw.model.OrderDetail;
import dw.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderDetailController {
    @Autowired
    OrderDetailService orderDetailService;

    @GetMapping("/orderdetails")
    public ResponseEntity<List<OrderDetail>> getOrderDetailAll() {
        return new ResponseEntity<>(orderDetailService.getAllOrderDetail(),
                HttpStatus.OK);
    }
}
