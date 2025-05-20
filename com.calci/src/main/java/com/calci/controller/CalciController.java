package com.calci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.calci.services.CalciService;

@Controller
public class CalciController {
	@Autowired
	CalciService cs;
	
	@GetMapping("/calc")
	public String calc(@RequestParam int num1,
						@RequestParam int num2, 
						@RequestParam String operation,
						Model m) {
		int result = 0;
		if(operation.equals("add"))
			result = cs.add(num1, num2);
		else if(operation.equals("sub"))
			result = cs.sub(num1, num2);
		else if(operation.equals("mul"))
			result = cs.mul(num1, num2);
		else 
			result = cs.div(num1, num2);
		
		m.addAttribute("result", result);
		return "result";
	}
}