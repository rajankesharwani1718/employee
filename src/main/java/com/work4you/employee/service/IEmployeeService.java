package com.work4you.employee.service;

import com.work4you.employee.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IEmployeeService {
    List<Employee> getEmployee(Integer pageNumber, Integer numberItem);
}
