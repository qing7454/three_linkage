package com.qing.common.util;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * 描述：spring上下文环境对象设置，获取类
 * 
 * @author fan.xiu
 * @version 1.0 2018-02-09
 */
@WebListener
@Configuration
public class SpringInit implements ServletContextListener {

	public static ApplicationContext springContext;
	public static ServletContext  servletContext;
	/**
	 * 构造器
	 */
	public SpringInit() {
		super();
	}

	/**
	 * 初始化上下文
	 * 
	 * @param event
	 *            ServletContextEvent
	 */
	public void contextInitialized(ServletContextEvent event) {
		springContext = WebApplicationContextUtils
				.getWebApplicationContext(event.getServletContext());
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
	}

	/**
	 * 获取上下文
	 * 
	 * @return ApplicationContext
	 */
	public static ApplicationContext getApplicationContext() {
		return springContext;
	}
	public static ServletContext getServletContext(){
		return servletContext;
	}

}