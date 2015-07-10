package com.java1234.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java1234.dao.BaseDAO;
import com.java1234.entity.Tag;
import com.java1234.service.TagService;

/**
 * 
 *
 * @author wangkai
 *
 */
@Service("tagService")
public class TagServiceImpl implements TagService {

	@Resource
	private BaseDAO<Tag> baseDAO;
	
	public List<Tag> findTagList() {
		StringBuffer hql = new StringBuffer("from Tag");
		return baseDAO.find(hql.toString());
	}

}
