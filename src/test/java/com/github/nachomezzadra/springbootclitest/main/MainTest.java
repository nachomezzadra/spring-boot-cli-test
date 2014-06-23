package com.github.nachomezzadra.springbootclitest.main;

import org.junit.Test;

public class MainTest {

	@Test
	public void shouldProperlyRun() throws Exception {
		String[] params = { "param one", "param two", "param three" };
		Application.main(params);
	}
}
