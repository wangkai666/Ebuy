package com.java1234.service;

import java.util.List;

import com.java1234.entity.News;
import com.java1234.entity.PageBean;

/**
 * ���ŷ���
 *
 * @author wangkai
 *
 */
public interface NewsService {

	/**
	 * ����ǰ�漸������
	 * @param s_news
	 * @param pageBean
	 * @return
	 */
	public List<News> findNewsList(News s_news,PageBean pageBean);
}
