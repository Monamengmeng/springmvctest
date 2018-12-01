package com.java.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 控制器类要处理对"/"的请求，并渲染应用的首页
 * 
 * @author Administrator
 *
 */



@Controller	//声明是控制器，这会使其成为组件扫描时的候选bean
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String home() {
		return "home";
	}
}
