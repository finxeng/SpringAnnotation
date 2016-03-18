package com.SpringAnnotation.utils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class testServletContextListener implements ServletContextListener {
	private static WebApplicationContext ctx;

	public ApplicationContext getApplicationContext() {
		return ctx;
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		ctx = WebApplicationContextUtils.getWebApplicationContext(arg0.getServletContext());
		String[] beanNames = ctx.getBeanDefinitionNames();
		System.out.println("一共实例了：" + beanNames.length);
		for (int i = 0; i < beanNames.length; i++) {
				System.out.println("实例了" + beanNames[i]);
		}

	}
}
