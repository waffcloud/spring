package com.service;

import javax.annotation.Resource;

import com.dao.UserDao;


import com.domain.User;
import org.springframework.stereotype.Service;

/**
 * 功能概要：UserService实现类
 * 
 * @author linbingwen
 * @since  2015年9月28日 
 */

@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao userDao;

	public User selectUserById(Integer userId) {
		return userDao.selectUserById(userId);
		
	}

}
