package com.relationship.jpa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relationship.jpa.models.Employee;
import com.relationship.jpa.service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    
    @RequestMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        System.out.println("get employees called!");
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
    @PostMapping("/employee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        Employee emp = employeeService.addEmployee(employee);
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }
    @PutMapping("/employee")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        Employee emp = employeeService.editEmployees(employee);
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }
    @DeleteMapping("/employee/{empid}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Integer empid){
        employeeService.deleteEmployees(empid);
        return new ResponseEntity<>("Employee with ID :" + empid + " deleted successfully", HttpStatus.OK);
    }
}