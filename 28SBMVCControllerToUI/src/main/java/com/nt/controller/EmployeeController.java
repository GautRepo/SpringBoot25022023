package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/show")
	public String getAllEmp(Model model) {
		model.addAttribute("listEmp", service.getEmployee());
		return "emp";
	}
	
	
}
