package com.github.nachomezzadra.springbootclitest.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.nachomezzadra.springbootclitest.BaseSpringTest;

public class TestControllerTest extends BaseSpringTest {

	@Autowired
	TestController testController;

	@Test
	public void shouldProperlyRun() throws Exception {
		testController.run("Some string", "some other str");
	}
}
