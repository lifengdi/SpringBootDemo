package com.lifengdi.myfirstspringboot.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	HelloWorldController  
 * @Description Spring Boot接口
 * @author  李锋镝
 * @date    2017年8月27日 下午3:34:56   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved.
 */
@RestController
public class HelloWorldController {

	@RequestMapping("/hello/{name}")
	String hello(@PathVariable String name, @RequestParam String param) {
		return "Hello " + name + " param:" + param;
	}
}

