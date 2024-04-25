package dw.service;

import dw.model.Department;
import dw.repository.DepartmentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    public List<Department> getDepartmentAll() {
        return departmentRepository.findAll();
    }
}