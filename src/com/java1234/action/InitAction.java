package com.java1234.action;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.java1234.entity.News;
import com.java1234.entity.Notice;
import com.java1234.entity.PageBean;
import com.java1234.entity.Product;
import com.java1234.entity.ProductBigType;
import com.java1234.entity.Tag;
import com.java1234.service.NewsService;
import com.java1234.service.NoticeService;
import com.java1234.service.ProductBigTypeService;
import com.java1234.service.ProductService;
import com.java1234.service.TagService;

/**
 * 初始化，把常用的信息放到application缓存中
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
		//将商品大类放入缓存
		ProductBigTypeService productBigTypeService = (ProductBigTypeService)applicationContext.getBean("productBigTypeService");
		List<ProductBigType> bigTypeList = productBigTypeService.findAllBigTypeList();
		servletContext.setAttribute("bigTypeList", bigTypeList);
		
		//将标签放入缓存
		TagService tagService = (TagService)applicationContext.getBean("tagService");
		List<Tag> tagList = tagService.findTagList();
		servletContext.setAttribute("tagList", tagList);
		
		//将公告放入缓存
		NoticeService noticeService = (NoticeService)applicationContext.getBean("noticeService");
		List<Notice> noticeList = noticeService.findNoticeList(null, new PageBean(1, 7));
		servletContext.setAttribute("noticeList", noticeList);
		
		//将新闻放入缓存
		NewsService newsService = (NewsService)applicationContext.getBean("newsService");
		List<News> newsList = newsService.findNewsList(null, new PageBean(1, 7));
		servletContext.setAttribute("newsList", newsList);
		
		//将特价商品放入缓存
		Product s_product = new Product();
		s_product.setSpecialPrice(1);
		ProductService productService = (ProductService)applicationContext.getBean("productService");
		List<Product> specialPriceProductList = productService.findProductList(s_product, new PageBean(1, 8));
		servletContext.setAttribute("specialPriceProductList", specialPriceProductList);
		
		//将热卖商品放入缓存
		s_product = new Product();
		s_product.setHot(1);
		List<Product> hotProductList = productService.findProductList(s_product, new PageBean(1, 8));
		servletContext.setAttribute("hotProductList", hotProductList);
	}

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}

}
