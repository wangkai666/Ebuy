package com.java1234.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java1234.dao.BaseDAO;
import com.java1234.entity.ProductBigType;
import com.java1234.service.ProductBigTypeService;

/**
 * 商品大类服务实现类
 *
 * @author wangkai
 *
 */
@Service("productBigTypeService")
public class ProductBigTypeServiceImpl implements ProductBigTypeService{

	@Resource
	private BaseDAO<ProductBigType> baseDAO;
	
	public List<ProductBigType> findAllBigTypeList() {
		return baseDAO.find("from ProductBigType");
	}

}
