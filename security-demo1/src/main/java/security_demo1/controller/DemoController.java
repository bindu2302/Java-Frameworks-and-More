package security_demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/hello")
	public String hello() {
		return "hello from spring boot";
	}
	
	@GetMapping("/hi")
	public String hi() {
		return "hi from spring boot";
	}
	
	@GetMapping("/ola")
	public String ola() {
		return "ola from spring boot";
	}
}
