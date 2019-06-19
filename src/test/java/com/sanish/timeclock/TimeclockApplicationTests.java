package com.sanish.timeclock;

import com.sanish.timeclock.controller.PunchController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
class TimeclockApplicationTests {

	@Autowired
	PunchController punchController;
	@Test
	void contextLoads() {
		assertNotNull(punchController);
	}

}
