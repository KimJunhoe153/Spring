package dw.service;

import dw.model.Customer;
import dw.repository.CustomerRepository;
import dw.repository.MileageRepository;
import dw.repository.OrderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    MileageRepository mileageRepository;
    @Autowired
    OrderRepository orderRepository;

    public List<Customer> getCustomerAll() {
        return customerRepository.findAll();
    }

    // 고객 전체의 평균마일리지보다 평균마일리지가 큰 고객 정보
    public List<Customer> getCustomerWithHighMileThanAvg() {
        List<Customer> customers = customerRepository.findAll();
        int sum = 0;
        for (int i = 0; i < customers.size(); i++) {
            sum = sum + customers.get(i).getMileage();
        }
        Double avg = (double) sum / (double) customers.size();
        return customers.stream().filter(c -> c.getMileage() > avg).collect(Collectors.toList());
    }
}