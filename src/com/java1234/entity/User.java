package com.java1234.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

/**
 * �û�
 *
 * @author wangkai
 *
 */
@Entity
public class User {

	/**
	 * ������PK
	 */
	private int id;
	
	/**
	 * ��ʵ����
	 */
	private String trueName;
	
	/**
	 * ��¼�û���
	 */
	private String userName;
	
	/**
	 * ����
	 */
	private String password;
	
	/**
	 * �Ա�
	 */
	private String sex;
	
	/**
	 * ����
	 */
	private Date birthday;
	
	/**
	 * ���֤����
	 */
	private String dentityCode;
	
	/**
	 * ����
	 */
	private String email;
	
	/**
	 * �ֻ���
	 */
	private String mobile;
	
	/**
	 * ��ַ
	 */
	private String address;
	
	/**
	 * ״̬��1����ͨ��Ա
	 */
	private int status = 1;

	@Id
	@GeneratedValue(generator="_native")
	@GenericGenerator(name="_native",strategy="native")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(length=20)
	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	@Column(length=20)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(length=20)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(length=5)
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Column(length=20)
	public String getDentityCode() {
		return dentityCode;
	}

	public void setDentityCode(String dentityCode) {
		this.dentityCode = dentityCode;
	}

	@Column(length=20)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(length=20)
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(length=200)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
