package com.nt.dao;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDAO {

	public String getEmp() {
		System.out.println("EmployeeDAO.getEmp()");
		/*if(true)
			throw new IllegalArgumentException("Nothing serious");*/
		return "HELLO";
	}
}
