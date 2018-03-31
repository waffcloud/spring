package com.service;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.domain.User ;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 功能概要：UserService单元测试
 * 
 * @author linbingwen
 * @since  2015年9月28日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class UserServiceTest  {
	@Autowired
	private UserService userService;

	Logger logger = Logger.getLogger(UserServiceTest.class);
	
	@Test
	public void selectUserByIdTest(){
		int i=1 ;
		User user = userService.selectUserById(i);
        logger.debug("查找结果" + user);
	}
	

}
