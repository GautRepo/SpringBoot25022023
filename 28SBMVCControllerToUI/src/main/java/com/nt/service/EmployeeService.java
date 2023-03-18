package com.nt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nt.entity.Employee;

@Service
public class EmployeeService {
	
	
	public List<Employee> getEmployee(){
		return List.of(new Employee(1,"Priya",100.00),
						new Employee(2,"Khushboo",200.00),
						new Employee(3,"Surbhi",300.00));
	}

}
