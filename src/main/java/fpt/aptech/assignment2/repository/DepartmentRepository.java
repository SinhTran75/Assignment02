package fpt.aptech.assignment2.repository;

import fpt.aptech.assignment2.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Optional<Department> findByDepartmentCode(int departmentCode);
}
