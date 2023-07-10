package com.greatlearning.employeemanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.employeemanagementsystem.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
