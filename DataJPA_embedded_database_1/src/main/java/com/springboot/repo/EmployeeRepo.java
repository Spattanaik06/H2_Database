package com.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> 
{
	
}
