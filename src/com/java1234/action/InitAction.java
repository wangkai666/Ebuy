package com.java1234.action;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.java1234.entity.ProductBigType;
import com.java1234.service.ProductBigTypeService;

/**
 * ≥ı ºªØ
 *	
 * @author wangkai
 *
 */
@Component
public class InitAction implements ServletContextListener,ApplicationContextAware{
 
	private static ApplicationContext applicationContext;
	
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}

	public void contextInitialized(ServletContextEvent servletContextEvent) {
		ServletContext servletContext = servletContextEvent.getServletContext();
		ProductBigTypeService productBigTypeService = (ProductBigTypeService)applicationContext.getBean("productBigTypeService");
		List<ProductBigType> bigTypeList = productBigTypeService.findAllBigTypeList();
		servletContext.setAttribute("bigTypeList", bigTypeList);
	}

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}

}
