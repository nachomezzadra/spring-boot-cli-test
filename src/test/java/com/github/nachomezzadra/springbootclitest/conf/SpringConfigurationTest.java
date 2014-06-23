package com.github.nachomezzadra.springbootclitest.conf;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.github.nachomezzadra.springbootclitest.BaseSpringTest;
import com.github.nachomezzadra.springbootclitest.controller.TestController;

public class SpringConfigurationTest extends BaseSpringTest {

	@Autowired
	ApplicationContext context;

	@Autowired
	TestController testController;

	@Test
	public void shouldProperlyLoadSpringContext() throws Exception {
		assertNotNull(this.context);
	}

	@Test
	public void shouldProperlyLoadTestController() throws Exception {
		assertNotNull(testController);
	}
}
