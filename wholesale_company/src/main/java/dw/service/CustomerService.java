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
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomer() {
        return customerRepository.findAll(); // 데이터베이스에서 고객 목록을 조회
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}

