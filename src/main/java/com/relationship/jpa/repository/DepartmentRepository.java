package com.relationship.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relationship.jpa.models.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}