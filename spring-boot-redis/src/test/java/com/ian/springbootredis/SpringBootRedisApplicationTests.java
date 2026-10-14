package com.ian.springbootredis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
class SpringBootRedisApplicationTests {

	@Autowired
	private Environment environment;

	@Test
	void contextLoads() {
	}

	@Test
	void redisPoolWaitIsBounded() {
		assertEquals(Duration.ofSeconds(5),
				environment.getProperty("spring.data.redis.lettuce.pool.max-wait", Duration.class));
	}

}
