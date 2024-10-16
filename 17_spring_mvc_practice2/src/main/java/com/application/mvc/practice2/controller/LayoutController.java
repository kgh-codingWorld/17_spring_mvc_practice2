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
	
	@GetMapping("/login")
	public String login() {
		return "chapter01_thymeleaf/layout/bootstrap/login";
	}
	
	@GetMapping("/mypage")
	public String mypage() {
		return "chapter01_thymeleaf/layout/bootstrap/mypage";
	}
	
	@GetMapping("/introduce")
	public String introduce() {
		return "chapter01_thymeleaf/layout/bootstrap/introduce";
	}

	@GetMapping("/blog")
	public String blog() {
		return "chapter01_thymeleaf/layout/bootstrap/blog";
	}
	
	@GetMapping("/cart")
	public String cart() {
		return "chapter01_thymeleaf/layout/bootstrap/cart";
	}
	
	@GetMapping("/shoppingList")
	public String shoppingList() {
		return "chapter01_thymeleaf/layout/bootstrap/shoppingList";
	}
	
}
