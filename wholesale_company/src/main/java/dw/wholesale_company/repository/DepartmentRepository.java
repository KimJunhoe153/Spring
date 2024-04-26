package dw.wholesale_company.repository;

import dw.wholesale_company.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, String> {
    //List<Department> findByDepartment(Department department);
}
