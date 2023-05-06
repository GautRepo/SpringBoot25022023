package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.dao.EmployeeDAO;

@Component
public class EmpRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeDAO dao;

	@Override
	public void run(String... args) throws Exception {
		dao.getEmp();
		

	}

}
