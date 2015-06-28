package com.java1234.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * ��Ʒ��������ʵ��
 *
 * @author wangkai
 *
 */
@Entity
@Table(name="t_order_product")
public class OrderProduct {

	private int id;
	
	/**
	 * ��Ʒ����
	 */
	private int num;

	@Id
	@GeneratedValue(generator="_native")
	@GenericGenerator(name="_native",strategy="native")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}
