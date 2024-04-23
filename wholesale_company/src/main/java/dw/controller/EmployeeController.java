package dw.controller;

import dw.model.Department;
import dw.model.Employee;
import dw.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<List<Employee>> saveEmployee(@RequestBody Department department) {
        return new ResponseEntity<>(employeeService.getAllEmployee(),
                HttpStatus.OK);
    }

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return new ResponseEntity<>(employeeService.getAllEmployee(),
                HttpStatus.OK);
    }
}
