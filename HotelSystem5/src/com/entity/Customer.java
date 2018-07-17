package com.entity;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable {

	// Fields

	private Integer cid;
	private String name;
	private String cardId;
	private String sex;
	private String teleohine;

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** minimal constructor */
	public Customer(Integer cid, String name, String cardId, String sex) {
		this.cid = cid;
		this.name = name;
		this.cardId = cardId;
		this.sex = sex;
	}

	/** full constructor */
	public Customer(Integer cid, String name, String cardId, String sex,
			String teleohine) {
		this.cid = cid;
		this.name = name;
		this.cardId = cardId;
		this.sex = sex;
		this.teleohine = teleohine;
	}

	// Property accessors

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardId() {
		return this.cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTeleohine() {
		return this.teleohine;
	}

	public void setTeleohine(String teleohine) {
		this.teleohine = teleohine;
	}

}