package com.java1234.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

/**
 * 订单
 *
 * @author wangkai
 *
 */
@Entity
@Table(name="t_order")
public class Order {

	/**
	 * 主键
	 */
	private int id;
	
	/**
	 * 订单编号
	 */
	private String orderNo;
	
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	/**
	 * 总金额
	 */
	private	float cost;
	
	/**
	 * 状态
	 */
	private int status;
	
	/**
	 * 用户
	 */
	private User user;

	private List<OrderProduct> orderProductList = new ArrayList<OrderProduct>();

	@Id
	@GeneratedValue(generator="_native")
	@GenericGenerator(name="_native",strategy="native")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	@ManyToOne
	@JoinColumn(name="userId",updatable=false)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="orderId")
	@Cascade(value={CascadeType.SAVE_UPDATE})
	public List<OrderProduct> getOrderProductList() {
		return orderProductList;
	}

	public void setOrderProductList(List<OrderProduct> orderProductList) {
		this.orderProductList = orderProductList;
	}
	
}
