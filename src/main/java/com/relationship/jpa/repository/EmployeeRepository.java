package com.relationship.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relationship.jpa.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}