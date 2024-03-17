package com.example.HomeWork26.service.impl;

import com.example.HomeWork26.exception.EmployeeAlreadyAddedException;
import com.example.HomeWork26.exception.EmployeeNotFoundException;
import com.example.HomeWork26.exception.EmployeeStorageIsFullException;
import com.example.HomeWork26.model.Employee;
import com.example.HomeWork26.service.EmployeeService;
import com.example.HomeWork26.service.EmployeeValidationService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static final int EMPLOYEE_STORAGE_SIZE = 10;
    private final Map<String, Employee> employees = new HashMap<>();

    private final EmployeeValidationService employeeValidationService;

    public EmployeeServiceImpl(EmployeeValidationService employeeValidationService) {
        this.employeeValidationService = employeeValidationService;
    }

    @Override
    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        employees.put(employee.getFullName(), employee);
        return employee;
    }

    @Override
    public Employee remove(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);

        if (!employees.containsKey(employee.getFullName())) {
            throw new EmployeeNotFoundException();
        }

        employees.remove(employee.getFullName());

        return employee;
    }

    @Override
    public Employee find(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);

        if (!employees.containsKey(employee.getFullName())) {
            throw new EmployeeNotFoundException();
        }

        return employee;
    }

    @Override
    public Collection<Employee> findAll() {
        return employees.values();
    }

    private Employee add(Employee employee) {
        if (employees.size() == EMPLOYEE_STORAGE_SIZE){
            throw new EmployeeStorageIsFullException();
        }

        if (employees.containsKey(employee.getFullName())) {
            throw new EmployeeAlreadyAddedException();
        }

        employeeValidationService.validate(employee.getFirstName(), employee.getLastName());

        employees.put(employee.getFirstName(), employee);

        return employee;
    }
}
