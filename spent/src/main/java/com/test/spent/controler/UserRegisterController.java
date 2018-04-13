package com.test.spent.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRegisterController {
	
	@GetMapping("/students/")
	public String Test(){
		String s="hai";
		return s;
	}

}
