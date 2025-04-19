package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.entity.Employee;
import com.springboot.repo.EmployeeRepo;

@SpringBootApplication
public class DataJpaEmbeddedDatabase1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaEmbeddedDatabase1Application.class, args);
		EmployeeRepo employeeRepo = context.getBean(EmployeeRepo.class);
		Employee emp=new Employee();
		emp.setEmpName("Suresh");
		emp.setEmpAddress("Nachuni");
		employeeRepo.save(emp);
	}

}
