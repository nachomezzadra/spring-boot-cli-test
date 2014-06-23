package com.github.nachomezzadra.springbootclitest.controller;

import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class TestController implements CommandLineRunner {

	private Logger LOGGER = org.slf4j.LoggerFactory
			.getLogger(TestController.class);

	public void run(String... arguments) throws Exception {
		LOGGER.info("Executing run method");
		for (String eachParam : arguments) {
			LOGGER.info("Received Parameter '{}'", eachParam);
		}

	}
}
