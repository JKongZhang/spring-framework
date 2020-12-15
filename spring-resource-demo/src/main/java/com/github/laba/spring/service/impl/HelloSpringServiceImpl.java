package com.github.laba.spring.service.impl;

import com.github.laba.spring.service.HelloSpringService;
import org.springframework.stereotype.Service;

/**
 * service impl
 *
 * @author laba zhang
 */
@Service
public class HelloSpringServiceImpl implements HelloSpringService {
	@Override
	public String sayHello(String name) {
		return "hello " + name;
	}
}
