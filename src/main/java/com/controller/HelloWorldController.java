package com.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/hello")
//@Api(tags="个人业务")
@Controller
public class HelloWorldController {


    @RequestMapping(value = "/hello",method = RequestMethod.GET ,produces = "application/json;charset=UTF-8")
  //  @ApiOperation(httpMethod = "GET", value = "个人信息")
    String hello(){
        return "hello" ;
    }
}
