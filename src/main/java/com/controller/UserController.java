package com.controller;

import javax.annotation.Resource;

import com.domain.User;
import com.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 功能概要：UserController
 * 
 * @author linbingwen
 * @since  2015年9月28日 
 */
@Controller
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping("/")
    public ModelAndView getIndex(){
		ModelAndView mav = new ModelAndView("index");

		User user = userService.selectUserById(1);
	    mav.addObject("user", user); 
        return mav;  
    }
}
