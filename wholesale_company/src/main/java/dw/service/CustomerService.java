package dw.service;

import dw.model.Customer;
import dw.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository; // 고객 데이터에 접근하기 위한 레포지토리 인터페이스

    public List<Customer> getAllCustomer() { // 고객 전체 목록을 반환한다
        return customerRepository.findAll(); // 데이터베이스에서 고객 목록을 조회
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}

