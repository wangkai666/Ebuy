package com.java1234.service.impl;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java1234.dao.BaseDAO;
import com.java1234.entity.PageBean;
import com.java1234.entity.Product;
import com.java1234.service.ProductService;

/**
 * 
 *
 * @author wangkai
 *
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Resource
	private BaseDAO<Product> baseDAO;
	
	public List<Product> findProductList(Product s_product, PageBean pageBean) {
		List<Object> param = new LinkedList<Object>();
		StringBuffer hql = new StringBuffer("from Product");	
		if (s_product != null) {
			if (s_product.getSpecialPrice() == 1 ) {
				hql.append(" and specialPrice=1 order by specialPriceTime desc");
			}
			if (s_product.getHot() == 1) {
				hql.append(" and hot=1 order by hotTime desc");
			}
		}
		if (pageBean != null) {
			String str = hql.toString().replaceFirst("and", "where");
			return baseDAO.find(str,param,pageBean);
		}else {
			return null;
		}
	}

}
