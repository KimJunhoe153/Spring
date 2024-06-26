package dw.wholesale_company.repository;

import dw.wholesale_company.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, String> {
    List<Customer> findAll();
//    List<Customer> findByCustomer(Customer customer);
}
