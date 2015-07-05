package com.java1234.service;

import java.util.List;

import com.java1234.entity.ProductBigType;

/**
 * 商品大类服务
 *
 * @author wangkai
 *
 */
public interface ProductBigTypeService {

	/**
	 * 查询所有的商品大类
	 * @return
	 */
	public List<ProductBigType> findAllBigTypeList();
}
