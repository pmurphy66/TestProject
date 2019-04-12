package com.heymurph.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heymurph.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
