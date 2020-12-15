package com.github.laba.spring.controller;

import com.github.laba.spring.service.HelloSpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * controller
 *
 * @author laba zhang
 */
@Controller
public class HelloController {

	@Autowired
	private HelloSpringService service;

	public void sayHello() {
		service.sayHello("laba");
	}
}
