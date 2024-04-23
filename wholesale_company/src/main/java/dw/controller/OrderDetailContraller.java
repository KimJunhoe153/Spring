package dw.controller;

import dw.model.OrderDetail;
import dw.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orderdetails")
public class OrderDetailContraller {

    @Autowired
    OrderDetailService orderDetailService;

    @PostMapping
    public ResponseEntity<List<OrderDetail>> saveOrderDetail(@RequestBody OrderDetail orderDetail) {
        return new ResponseEntity<>(orderDetailService.getAllOrderDetail(),
                HttpStatus.OK);
    }
}
