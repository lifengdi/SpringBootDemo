package com.lifengdi.myfirstspringboot.springboot;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.lifengdi.myfirstspringboot.springboot.controller.HelloWorldController;

/**
 * 
 * All rights Reserved, Designed By www.lifengdi.com
 * 
 * @ClassName SpringBootTest
 * @Description Spring Boot测试类
 * @author 李锋镝
 * @date 2017年8月27日 下午3:36:33
 * @version v1.0.0
 * @Copyright 2017 www.lifengdi.com All rights reserved.
 */
@org.springframework.boot.test.context.SpringBootTest
public class SpringBootTest {
	private MockMvc mockMvc;

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
	}

	@Test
	public void testHello() {
		try {
			mockMvc.perform(MockMvcRequestBuilders.get("/hello/lfd").param("param", "hahaha").accept(MediaType.APPLICATION_JSON))
					.andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
