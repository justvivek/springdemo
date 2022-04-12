package com.vwake.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class demoController {
	
	@RequestMapping("/d1")
	public String handle() {
		return "This is demo1";
	}
	
	@RequestMapping("/d2")
	public String handle2() {
		return "This is demo2";
	}


}
