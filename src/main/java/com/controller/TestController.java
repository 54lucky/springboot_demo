package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//访问的项目controller层的方式  http://localhost:8080/路径映射（不需要项目名称）
@Controller
@ResponseBody
public class TestController {
	@RequestMapping("/hello")
	public String hello(){
		return "hello world!";
	}

}
