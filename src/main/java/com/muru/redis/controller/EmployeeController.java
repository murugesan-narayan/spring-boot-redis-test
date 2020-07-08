package com.muru.redis.controller;

import com.muru.redis.model.Employee;
import com.muru.redis.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
@Slf4j
@RestController
@RequestMapping(value = "/api/redis/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    // Save a new employee.
    // Url - http://localhost:10091/api/redis/employee
    @PostMapping
    public String save(@RequestBody final Employee employee) {
        log.info("Saving the new employee to the redis.");
        service.save(employee);
        return "Successfully added. Employee with id= " + employee.getId();
    }

    // Get all employees.
    // Url - http://localhost:10091/api/redis/employee/getall
    @GetMapping("/getall")
    public Map<String, Employee> findAll() {
        log.info("Fetching all employees from the redis.");
        final Map<String, Employee> employeeMap = service.findAll();
        // Todo - If developers like they can sort the map (optional).
        return employeeMap;
    }

    // Get employee by id.
    // Url - http://localhost:10091/api/redis/employee/get/<employee_id>
    @GetMapping("/get/{id}")
    public Employee findById(@PathVariable("id") final String id) {
        log.info("Fetching employee with id= " + id);
        return service.findById(id);
    }

    // Delete employee by id.
    // Url - http://localhost:10091/api/redis/employee/delete/<employee_id>
    @DeleteMapping("/delete/{id}")
    public Map<String, Employee> delete(@PathVariable("id") final String id) {
        log.info("Deleting employee with id= " + id);
        // Deleting the employee.
        service.delete(id);
        // Returning the all employees (post the deleted one).
        return findAll();
    }
}
