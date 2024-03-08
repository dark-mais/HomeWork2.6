package com.example.HomeWork26.controller;

import com.example.HomeWork26.model.Employee;
import com.example.HomeWork26.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("max-salary")
    public Employee findEmployeeWithMaxSalary(@RequestParam(value = "departmentID") int departmentID) {
        return departmentService.findEmployeeWithMaxSalary(departmentID);
    }


    @GetMapping("min-salary")
    public Employee findEmployeeWithMinSalary(@RequestParam(value = "departmentID") int departmentID) {
        return departmentService.findEmployeeWithMinSalary(departmentID);
    }

    @GetMapping(value = "all", params = {"departmentID"})
    public Collection<Employee> findEmployeesByDepartment(@RequestParam(value = "departmentID") int departmentID) {
        return departmentService.findEmployeesByDepartment(departmentID);
    }

    @GetMapping("all")
    public Map<Integer, List<Employee>> findEmployeesByDepartment() {
        return departmentService.findEmployeesByDepartment();
    }


}
