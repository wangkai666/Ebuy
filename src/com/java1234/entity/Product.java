package com.java1234.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 
 * ��Ʒ
 *
 * @author wangkai
 *
 */
@Entity
@Table(name="t_product")
public class Product {

	/**
	 * ������pk
	 */
	private int id;
	
	/**
	 * ��Ʒ����
	 */
	private String name;
	
	/**
	 * �۸�
	 */
	private int price;

	/**
	 * ���
	 */
	private int stock;
	
	/**
	 * ͼƬ��ַ
	 */
	private String proPic;
	
	/**
	 * ��Ʒ����
	 */
	private String description;
	
	/**
	 * �Ƿ�����
	 */
	private int hot;
	
	/**
	 * ����ʱ��
	 */
	private Date hotTime;
	
	/**
	 * �����۸�
	 */
	private int specialPrice;
	
	/**
	 * ����ʱ��
	 */
	private Date specialPriceTime;
	
	/**
	 * ��Ʒ����
	 */
	private ProductBigType productBigType;
	
	/**
	 * ��ƷС��
	 */
	private ProductSmallType productSmallType;

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
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getProPic() {
		return proPic;
	}

	public void setProPic(String proPic) {
		this.proPic = proPic;
	}

	@Column(length=2000)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getHot() {
		return hot;
	}

	public void setHot(int hot) {
		this.hot = hot;
	}

	public Date getHotTime() {
		return hotTime;
	}

	public void setHotTime(Date hotTime) {
		this.hotTime = hotTime;
	}

	public int getSpecialPrice() {
		return specialPrice;
	}

	public void setSpecialPrice(int specialPrice) {
		this.specialPrice = specialPrice;
	}

	public Date getSpecialPriceTime() {
		return specialPriceTime;
	}

	public void setSpecialPriceTime(Date specialPriceTime) {
		this.specialPriceTime = specialPriceTime;
	}

	@ManyToOne
	@JoinColumn(name="bigTypeId")
	public ProductBigType getProductBigType() {
		return productBigType;
	}

	public void setProductBigType(ProductBigType productBigType) {
		this.productBigType = productBigType;
	}

	@ManyToOne
	@JoinColumn(name="smallTypeId")
	public ProductSmallType getProductSmallType() {
		return productSmallType;
	}

	public void setProductSmallType(ProductSmallType productSmallType) {
		this.productSmallType = productSmallType;
	}
	
	
	
	
}
