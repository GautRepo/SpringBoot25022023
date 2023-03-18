package com.nt.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
	
	@RequestMapping("/show")
	public String showPage(Model model) {
		model.addAttribute("eid", 1);
		model.addAttribute("ename", "Ravi");
		List<String> list = List.of("Gautam","Pavan","Bhadani","Shivam");
		model.addAttribute("Namelist", list);
		return "emp";
	}

}
