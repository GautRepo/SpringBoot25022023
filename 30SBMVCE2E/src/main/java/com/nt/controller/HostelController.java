package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.entity.Hostel;
import com.nt.service.IHostelService;

@Controller
public class HostelController {
	
	@Autowired
	private IHostelService service;
	
	@GetMapping("/register")
	public String showReg(Model model) {
		model.addAttribute("host",new Hostel());
		return "HostReg";
	}
	
	@PostMapping("/save")
	public String saveStudent(@ModelAttribute Hostel std, Model model) {
		Hostel hostal =service.addStd(std);
		model.addAttribute("message","Student"+hostal.getHid()+"saved");
		model.addAttribute("host", new Hostel());
		return "HostReg";
	}
	
	@GetMapping("/all")
	public String fetchAll(Model model) {
		List<Hostel> listHostel = service.getAllStudent();
		model.addAttribute("list", listHostel);
		return "showDetail";
		
	}
	
	@GetMapping("/delete")
	public String deleteById(@RequestParam Integer id) {
		service.deleteStd(id);
		return "redirect:all";
	}
	
	@GetMapping("/edit")
	public String updateById(@RequestParam Integer id, Model model) {
		model.addAttribute("host", service.getOneStd(id));
		return "editStudent";
	}
	
	@PostMapping("/update")
	public String updateDetail(@ModelAttribute Hostel host) {
		service.updateStd(host);
		return "redirect:all";
	}
	
	@GetMapping("/allPage")
	public String fetchAll(@PageableDefault(page=0,size=3) Pageable p, Model model) {
		Page<Hostel> page= service.getStdsPage(p);
		model.addAttribute("page", page);
		return "showDetailPageable";
	}

}
