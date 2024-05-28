package com.example.demoJenkinsCiCd;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoJenkinsCiCdApplicationTests {
	private static final Logger logger= LoggerFactory.getLogger(DemoJenkinsCiCdApplication.class);


	@Test
	void contextLoads() {
		logger.debug("hi from test method");

	}

}
