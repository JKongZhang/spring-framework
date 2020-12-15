package com.github.laba.spring;

import com.github.laba.spring.controller.HelloController;
import com.github.laba.spring.service.HelloSpringService;
import com.github.laba.spring.service.impl.HelloSpringServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 入口
 *
 * @author laba zhang
 */
@Configuration
@ComponentScan("com.github.laba.spring")
public class MainEntrance {
	public static void main(String[] args) {
//		configWithXml();
		configWithAnnotation();
	}

	private static void configWithAnnotation() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainEntrance.class);
		String[] beanNames = ctx.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
		HelloController helloController = ctx.getBean(HelloController.class);
		helloController.sayHello();
	}
 
	private static void configWithXml() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/spring-config.xml");
		HelloSpringService helloSpringService = ctx.getBean("helloSpringService", HelloSpringServiceImpl.class);
		System.out.println(helloSpringService.sayHello("laba"));
	}
}
