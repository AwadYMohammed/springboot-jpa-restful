package com.atr.restfull.springbootjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomePage {
@GetMapping("/")
	public String gitHub() {
		return "index.html";
	}
	
}
