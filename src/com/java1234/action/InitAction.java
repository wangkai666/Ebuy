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
 * ��ʼ�����ѳ��õ���Ϣ�ŵ�application������
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
		//����Ʒ������뻺��
		ProductBigTypeService productBigTypeService = (ProductBigTypeService)applicationContext.getBean("productBigTypeService");
		List<ProductBigType> bigTypeList = productBigTypeService.findAllBigTypeList();
		servletContext.setAttribute("bigTypeList", bigTypeList);
		
		//����ǩ���뻺��
		TagService tagService = (TagService)applicationContext.getBean("tagService");
		List<Tag> tagList = tagService.findTagList();
		servletContext.setAttribute("tagList", tagList);
		
		//��������뻺��
		NoticeService noticeService = (NoticeService)applicationContext.getBean("noticeService");
		List<Notice> noticeList = noticeService.findNoticeList(null, new PageBean(1, 7));
		servletContext.setAttribute("noticeList", noticeList);
		
		//�����ŷ��뻺��
		NewsService newsService = (NewsService)applicationContext.getBean("newsService");
		List<News> newsList = newsService.findNewsList(null, new PageBean(1, 7));
		servletContext.setAttribute("newsList", newsList);
		
		//���ؼ���Ʒ���뻺��
		Product s_product = new Product();
		s_product.setSpecialPrice(1);
		ProductService productService = (ProductService)applicationContext.getBean("productService");
		List<Product> specialPriceProductList = productService.findProductList(s_product, new PageBean(1, 8));
		servletContext.setAttribute("specialPriceProductList", specialPriceProductList);
		
		//��������Ʒ���뻺��
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
