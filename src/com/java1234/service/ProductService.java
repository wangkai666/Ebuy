package com.java1234.service;

import java.util.List;

import com.java1234.entity.PageBean;
import com.java1234.entity.Product;

/**
 * ��������
 *
 * @author wangkai
 *
 */
public interface ProductService {
	
	/**
	 * ��ѯǰ�漸����Ʒ
	 * @param s_product
	 * @param pageBean
	 * @return
	 */
	public List<Product> findProductList(Product s_product,PageBean pageBean);

}
