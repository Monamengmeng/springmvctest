package com.java.spring.controller;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.java.spring.config.RootConfig;
import com.java.spring.config.WebConfig;

public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	@Override
	protected String[] getServletMappings() {		//将DispatcherServlet映射到"/"
		return new String[] {"/"};		//此方法表示：它会是应用的默认Servlet，它会处理进入应用的所有请求
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {RootConfig.class};
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses() {		//制定配置类
		return new Class<?>[] {WebConfig.class};
	}
}
