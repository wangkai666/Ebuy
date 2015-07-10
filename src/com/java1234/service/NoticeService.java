package com.java1234.service;

import java.util.List;

import com.java1234.entity.Notice;
import com.java1234.entity.PageBean;

/**
 * 公告
 *
 * @author wangkai
 *
 */
public interface NoticeService {
	
	/**
	 * 返回前八条公告
	 * @param s_notice
	 * @param pageBean
	 * @return
	 */
	public List<Notice> findNoticeList(Notice s_notice,PageBean pageBean);

	
}
