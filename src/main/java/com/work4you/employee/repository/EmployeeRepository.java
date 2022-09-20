package com.work4you.employee.repository;

import com.work4you.employee.entity.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Short> {
    List<Employee> findAll();
}
