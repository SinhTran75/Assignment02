package fpt.aptech.assignment2.service;

import fpt.aptech.assignment2.entity.Employee;

import java.util.*;
public interface EmployeeService {

    Optional<Employee> getEmployeeById(Long employeeId);
}
