package com.java1234.service;

import java.util.List;

import com.java1234.entity.Tag;

/**
 * ��ǩ����
 *
 * @author wangkai
 *
 */
public interface TagService {

	/**
	 * �������е�Tag
	 * @return
	 */
	public List<Tag> findTagList();
	
}
