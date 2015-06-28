package com.java1234.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 商品小类
 *
 * @author wangkai
 *
 */
@Entity
@Table(name="t_smallType")
public class ProductSmallType {

	/**
	 * 主键，pk
	 */
	private int id;
	
	/**
	 * 名称
	 */
	private String name;
	
	/**
	 * 备注
	 */
	private String memo;
	
	/**
	 * 商品大类
	 */
	private ProductBigType bigType;
	
	/**
	 * 商品
	 */
	private List<Product> productList = new ArrayList<Product>();

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

	@ManyToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name="bigTypeId")
	public ProductBigType getBigType() {
		return bigType;
	}

	public void setBigType(ProductBigType bigType) {
		this.bigType = bigType;
	}

	@OneToMany(mappedBy="smallType")
	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
	
}
