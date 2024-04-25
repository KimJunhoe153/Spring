package dw.controller;

import dw.model.Employee;
import dw.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getEmployeeAll() {
        return new ResponseEntity<>(employeeService.getEmployeeAll(),
                HttpStatus.OK);
    }

    @GetMapping("/employees/hiredate/latest")
    public ResponseEntity<Employee> getEmployeeByHireLatest() {
        return new ResponseEntity<>(employeeService.getEmployeeByHireLatest(),
                HttpStatus.OK);
    }
}
