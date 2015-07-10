package com.java1234.service;

import java.util.List;

import com.java1234.entity.News;
import com.java1234.entity.PageBean;

/**
 * 新闻服务
 *
 * @author wangkai
 *
 */
public interface NewsService {

	/**
	 * 返回前面几条新闻
	 * @param s_news
	 * @param pageBean
	 * @return
	 */
	public List<News> findNewsList(News s_news,PageBean pageBean);
}
