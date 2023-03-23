package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustController {

	@RequestMapping("/show")
	public String showPage(@RequestParam("eid") Integer id,@RequestParam(value="ename",required = false) String ename,
							@RequestParam Double esal,Model model) {
		
		model.addAttribute("eeid", id);
		model.addAttribute("ename", ename);
		model.addAttribute("sal", esal);
		return "data";
	}
}
