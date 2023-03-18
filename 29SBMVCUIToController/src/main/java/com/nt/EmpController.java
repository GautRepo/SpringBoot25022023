package com.nt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.entity.Customer;

@Controller
public class EmpController {
	
	@RequestMapping
	public String getForm() {
		return "empForm";
	}
	
	@RequestMapping("/savecust")
	public String saveCust(@ModelAttribute("cus") Customer cu ,Model model) {
		model.addAttribute("cust", cu);
		return "saveCust";
	}

}
