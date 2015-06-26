package com.java1234.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * ����
 *
 * @author wangkai
 *
 */
@Entity
@Table(name="t_news")
public class News {

	/**
	 * ������PK
	 */
	private int id;
	
	/**
	 * ����
	 */
	private String title;
	
	/**
	 * ����
	 */
	private String content;
	
	/**
	 * ����ʱ��
	 */
	private Date createName;

	@Id
	@GeneratedValue(generator="_native")
	@GenericGenerator(name="_native",strategy="native")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(length=50)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Lob
	@Column(columnDefinition="TEXT")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateName() {
		return createName;
	}

	public void setCreateName(Date createName) {
		this.createName = createName;
	}
	
	
	
	
}
