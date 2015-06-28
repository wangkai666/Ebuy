package com.java1234.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * ��Ʒ����
 *
 * @author wangkai
 *
 */
@Entity
@Table(name="t_bigType")
public class ProductBigType {

	/**
	 * ������pk
	 */
	private int id;
	
	/**
	 * ����
	 */
	private String name;
	
	/**
	 * ��ע
	 */
	private String memo;
	
	/**
	 * ��Ʒ
	 */
	private List<Product> productList = new ArrayList<Product>();
	
	
	/**
	 * ��ƷС��
	 */
	private List<ProductSmallType> productSmallTypeList = new ArrayList<ProductSmallType>();

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

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	@OneToMany(mappedBy="bigType")
	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	@OneToMany(mappedBy="bigType",fetch=FetchType.EAGER)
	public List<ProductSmallType> getProductSmallTypeList() {
		return productSmallTypeList;
	}

	public void setProductSmallTypeList(List<ProductSmallType> productSmallTypeList) {
		this.productSmallTypeList = productSmallTypeList;
	}
	
	
}
