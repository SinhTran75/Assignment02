package fpt.aptech.assignment2.service.impl;

import lombok.AllArgsConstructor;
import fpt.aptech.assignment2.repository.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fpt.aptech.assignment2.service.EmployeeService;
import fpt.aptech.assignment2.entity.*;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Optional<Employee> getEmployeeById(Long id) {
        Employee employee = employeeRepository.getEmployeeById(id).orElseThrow(
                () -> new GlobalExceptionHandler("Employee", "id"));
        return Optional.of(employee);
    }



}
