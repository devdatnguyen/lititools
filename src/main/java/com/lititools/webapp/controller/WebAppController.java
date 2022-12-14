package com.lititools.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
@Controller
public class WebAppController {

	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("name", "Chuck Ron");
		return "login/Login";
	}
	
	@GetMapping
	public String goHome(Model model) {
		
		return "home/home";
	}
	
	@GetMapping("/test")
	public String testTemple(Model model) {
		return "index";
	}
	
	@GetMapping("/layout")
	public String testLayout(Model model) {
		return "layout/layout";
	}
	
	
}
