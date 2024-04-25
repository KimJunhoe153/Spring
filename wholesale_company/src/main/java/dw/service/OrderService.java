package dw.service;

import dw.model.Customer;
import dw.model.Order;
import dw.repository.OrderRepository;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public List<Order> getOrderAll() {
        return orderRepository.findAll();
    }

    //주문일이 2021년 5월 1일 이후인 주문 정보 얻기
//    public List<Order> getOrderByDateAfter(LocalDate date) {
//        List<Order> orders = orderRepository.findAll();
//        return orders.stream().filter(a -> a.getOrderDate().compareTo(date) > 0)
//                .collect(Collectors.toList());
//    }

    // 2020년 4월9일에 주문한 고객의 모든 정보를 보이기
    public List<String> getCustomerByOrderDate(LocalDate orderDate) {
        List<Order> orders = orderRepository.findByOrderDate(orderDate);
        return orders.stream().map(order -> order.getCustomer())
                .collect(Collectors.toList());
    }
}