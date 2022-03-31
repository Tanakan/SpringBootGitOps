package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.demo.controller.MenuController;

@SpringBootTest
public class MenuControllerTest {
	@Autowired
	public MenuController menuController;
	
	public MockMvc mockMvc;
	

}
