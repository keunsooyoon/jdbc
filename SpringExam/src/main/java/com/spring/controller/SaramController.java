package com.spring.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SaramController {
	
	@RequestMapping("/page")
	public String test() {
		
		return "testpage";
	}
	
	@GetMapping("/create")
	public String create() {
		return "create";
	}
	
	@Autowired
	SaramService saramService;
	
	@PostMapping("/create")
	public String create(@RequestParam Map<String, Object> map) {
		System.out.println("Controller");
		System.out.println(map.get("id"));
		System.out.println(map.get("name"));
		System.out.println(map.get("age"));
		System.out.println();
		
		saramService.insert(map);
		
		return "/";
	}
	
	@GetMapping("/select")
	public String select(Model model) {
		
		List<Map<String, Object>> list = saramService.select();
		
		model.addAttribute("Sarams", list);
		
		return "select";
	}

}
