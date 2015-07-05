package com.java1234.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	/**
	 * ����
	 */
	private Order order;
	
	/**
	 * ��Ʒ
	 */
	private Product product;

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

	@ManyToOne
	@JoinColumn(name="orderId")
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@ManyToOne
	@JoinColumn(name="productId")
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
