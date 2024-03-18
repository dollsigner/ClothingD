package com.clothingd.xiaopu;

import com.clothingd.xiaopu.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = XiaopuApplication.class)
class XiaopuApplicationTests {
	@Autowired
	UserService userService;

	@Test
	void contextLoads() {
		System.out.println("This is contextLoads");
		userService.addUser(1,0,"xiix","ssssssssssssssssssss","zheshiwo");
	}

}
