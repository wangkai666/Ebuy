package com.java1234.service;

import java.util.List;

import com.java1234.entity.Tag;

/**
 * 标签服务
 *
 * @author wangkai
 *
 */
public interface TagService {

	/**
	 * 返回所有的Tag
	 * @return
	 */
	public List<Tag> findTagList();
	
}
