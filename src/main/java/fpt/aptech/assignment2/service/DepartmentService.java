package fpt.aptech.assignment2.service;

import fpt.aptech.assignment2.entity.*;

import java.util.Optional;

public interface DepartmentService {
    Optional<Department> getDepartmentByCode(int code);
}
