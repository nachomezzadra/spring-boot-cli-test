package com.github.nachomezzadra.springbootclitest;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/META-INF/spring-boot-cli-test-application-context.xml" })
public abstract class BaseSpringTest {

}
