package dw.repository;

import dw.model.Department;
import dw.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Department> findByDepartment(Department department);

}
