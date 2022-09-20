package com.work4you.employee.service;

import com.work4you.employee.entity.Employee;
import com.work4you.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployee(Integer pageNumber, Integer numberItem) {
        return employeeRepository.findAll();
    }
}
