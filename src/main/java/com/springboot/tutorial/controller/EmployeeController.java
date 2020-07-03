package com.springboot.tutorial.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.tutorial.model.Employee;

@Controller
public class EmployeeController {
	@GetMapping("/")
	public String showHome(Model model) {
		return "index";
	}

	@GetMapping("/registration_form")
	public String showRegistrationForm(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "registration_form";
	}

	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute Employee employee, Model model) {		
		model.addAttribute("employee", employee);
		return "display_form";
	}

}
