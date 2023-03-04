package com.nt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {
	
	/*@RequestMapping("show")
	public String getHome() {
		return "home";
	}*/
	
	@RequestMapping(value="show",method= {RequestMethod.GET,RequestMethod.POST})
	public String getHome() {
		return "home";
	}
	
	/*@RequestMapping("emp")
	public String getEmp() {
		return "empPage";
	}*/
	
	/*@RequestMapping(value={"emp","first","sec"})
	public String getEmp() {
		return "empPage";
	}*/
	
	@RequestMapping(value="emp")
	public String getEmp() {
		return "empPage";
	}
	

}
