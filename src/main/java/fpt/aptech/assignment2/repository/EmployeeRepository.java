package fpt.aptech.assignment2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import fpt.aptech.assignment2.entity.*;
import java.util.*;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee>  getEmployeeById(Long id);

}
