package com.lititools.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ToolsController {
	
	@GetMapping("/tool-change-name")	
	public String changeName(Model model) {
		return "tools/change-name";
	}
}
