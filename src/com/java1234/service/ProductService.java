package com.java1234.service;

import java.util.List;

import com.java1234.entity.PageBean;
import com.java1234.entity.Product;

/**
 * 今日热卖
 *
 * @author wangkai
 *
 */
public interface ProductService {
	
	/**
	 * 查询前面几条产品
	 * @param s_product
	 * @param pageBean
	 * @return
	 */
	public List<Product> findProductList(Product s_product,PageBean pageBean);

}
