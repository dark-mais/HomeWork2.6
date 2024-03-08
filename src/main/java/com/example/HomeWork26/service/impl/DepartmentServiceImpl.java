package com.example.HomeWork26.service.impl;

import com.example.HomeWork26.exception.EmployeeNotFoundException;
import com.example.HomeWork26.model.Employee;
import com.example.HomeWork26.service.DepartmentService;
import com.example.HomeWork26.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.groupingBy;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final EmployeeService employeeService;

    public DepartmentServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public Employee findEmployeeWithMaxSalary(int departmentID) {
        return employeeService.findAll().stream()
                .filter(e -> e.getDepartmentID() == departmentID)
                .max(comparingInt(Employee::getSalary))
                .orElseThrow(EmployeeNotFoundException::new);
    }

    @Override
    public Employee findEmployeeWithMinSalary(int departmentID) {
        return employeeService.findAll().stream()
                .filter(e -> e.getDepartmentID() == departmentID)
                .min(comparingInt(Employee::getSalary))
                .orElseThrow(EmployeeNotFoundException::new);
    }

    @Override
    public Collection<Employee> findEmployeesByDepartment(int departmentID) {
        return employeeService.findAll().stream()
                .filter(e -> e.getDepartmentID() == departmentID)
                .sorted(comparing(Employee::getFullName))
                .collect(Collectors.toList());
    }

    @Override
    public Map<Integer, List<Employee>> findEmployeesByDepartment() {
        return employeeService.findAll().stream().collect(groupingBy(Employee::getDepartmentID));
    }
}
