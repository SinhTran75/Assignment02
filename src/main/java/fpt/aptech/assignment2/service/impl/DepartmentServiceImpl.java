package fpt.aptech.assignment2.service.impl;

import lombok.AllArgsConstructor;
import fpt.aptech.assignment2.repository.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fpt.aptech.assignment2.service.*;
import fpt.aptech.assignment2.entity.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(
            GlobalExceptionHandler.class);

    @Override
    public Optional<Department> getDepartmentByCode(int code) {
        Department department = departmentRepository.findByDepartmentCode(code).orElseThrow(() -> new GlobalExceptionHandler("Department", "code"));
        return Optional.of(department);
    }
}
