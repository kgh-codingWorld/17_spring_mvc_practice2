package com.application.mvc.practice2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/th/layout")
public class LayoutController {

	@GetMapping("/index")
	public String index() {
		return "chapter01_thymeleaf/layout/bootstrap/index";
	}
}
