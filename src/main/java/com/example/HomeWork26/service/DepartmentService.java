package com.example.HomeWork26.service;

import com.example.HomeWork26.model.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Employee findEmployeeWithMaxSalary(int departmentID);

    Employee findEmployeeWithMinSalary(int departmentID);

    Collection<Employee> findEmployeesByDepartment(int departmentID);

    Map<Integer, List<Employee>> findEmployeesByDepartment();
}