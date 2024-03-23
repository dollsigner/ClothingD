package com.clothingd.xiaopu;

import com.clothingd.xiaopu.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = XiaopuApplication.class)
class XiaopuApplicationTests {
	@Autowired
	UserServiceImpl userServiceImpl;

	@Test
	void contextLoads() {
		System.out.println("This is contextLoads");
		userServiceImpl.addUser(1,0,"xiix","ssssssssssssssssssss","zheshiwo");
	}

}
