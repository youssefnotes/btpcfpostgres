package tech.solex.cfspringbootpostgress.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.solex.cfspringbootpostgress.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
