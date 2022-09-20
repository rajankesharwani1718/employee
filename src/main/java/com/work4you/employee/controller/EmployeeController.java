package com.work4you.employee.controller;

import com.work4you.employee.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/employee")
@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/")
    public ResponseEntity<?> getEmployees(@RequestParam( defaultValue = "0" ) Integer pageNumber , @RequestParam( defaultValue =  "10") Integer numberItem) {
        return new ResponseEntity<>(employeeService.getEmployee(pageNumber,numberItem), HttpStatus.OK);
    }
}
