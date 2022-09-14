package com.openclassrooms.helloworld;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.openclassrooms.helloworld.model.HelloWorld;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.openclassrooms.helloworld.service.BusinessService;

@SpringBootTest
class HelloworldApplicationTests {

	@Autowired
	private BusinessService businessService;

	@Test
	void contextLoads() {
	}

	@Test
	public void testGetHelloWorld() {

		String expected = "Hello World!";

		String result = businessService.getHelloWorld().getValue();

		assertEquals("Hello World", "Hello World");
	}

}
