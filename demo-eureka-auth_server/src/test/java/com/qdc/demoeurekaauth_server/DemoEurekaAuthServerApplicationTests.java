package com.qdc.demoeurekaauth_server;

import com.alibaba.druid.pool.DruidDataSource;
import com.qdc.demoeurekaauth_server.mapper.UserMapper;
import com.qdc.demoeurekaauth_server.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetailsService;

@SpringBootTest
class DemoEurekaAuthServerApplicationTests {

	@Autowired
	private DruidDataSource druidDataSource;
	@Autowired
	private UserService userService;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserDetailsService userDetailsService;

	@Test
	void contextLoads() {
		System.out.println(druidDataSource);
	}
	@Test
	void testGetUser(){
		System.out.println(userMapper.findByUsername("admin"));
	}
	@Test
	void testUserDetailes() {
		System.out.println(userDetailsService.loadUserByUsername("admin"));
	}

	}
