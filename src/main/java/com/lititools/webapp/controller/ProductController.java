package com.lititools.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

	@GetMapping("/product")
	public String showFormProduct() {
		return "product/add-product";
	}
	
	@PostMapping("/product")
	public String addProduct(){
		return "product/add-product";
	}
}
