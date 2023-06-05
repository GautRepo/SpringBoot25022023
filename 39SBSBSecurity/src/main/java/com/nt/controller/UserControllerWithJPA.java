package com.nt.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.nt.model.User;
import com.nt.service.IUserService;

@Controller
@SessionAttributes({"mydata","userRole"})
public class UserControllerWithJPA {
	
	@Autowired
	private IUserService service;
	
	@GetMapping("/register")
	public String showReg() {
		return "UserRegisterration";
	}
	
	@PostMapping("/save")
	public String saveUser(@ModelAttribute User user,Model model) {
		model.addAttribute("message" ,("User register with id "+ service.saveUser(user)) );
		return "UserRegisterration";
	}
	
	@GetMapping("/home")
	public String showLogin() {
		return "HomePage";
	}
	
	@GetMapping("/admin")
	public String showAdmin() {
		return "AdminPage";
	}
	
	@GetMapping("/emp")
	public String showEmp() {
		return "EmpPage";
	}
	
	@GetMapping("/common")
	public String showCommon(Principal p , Model m) {
		String un = p.getName();
		m.addAttribute("un",un);
		m.addAttribute("mydata","mydata");
		m.addAttribute("userRole","user");
		return "common";
	}
	
	@GetMapping("/denied")
	public String showNoAccess() {
		return "accessDenied";
	}

}
