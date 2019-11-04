package com.ecomm.inventory.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Ecommerce
//  @ File Name : MetaData.java
//  @ Date : 11/4/2019
//  @ Author : 
//
//




/** */
@Entity
@Table(name="metadata")
public class MetaData {
	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the modifiedBy
	 */
	public User getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * @param modifiedBy the modifiedBy to set
	 */
	public void setModifiedBy(User modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/**
	 * @return the createdBy
	 */
	public User getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	/** */
	@Column(name="modified_date")
	   @Temporal(TemporalType.TIMESTAMP)
	private Date modifiedDate;
	
	/** */
	@Column(name="created_date")
	   @Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;
	
	/** */
	@JoinColumn(name="modified_by")
	@OneToOne
	private User modifiedBy;
	
	/** */
	@JoinColumn(name="created_by")
	@OneToOne
	private User createdBy;
	@Id
	@Column(name="id")
	private Integer id;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
}
