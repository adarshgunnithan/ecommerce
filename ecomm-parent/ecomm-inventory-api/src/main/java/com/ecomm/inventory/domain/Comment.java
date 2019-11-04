package com.ecomm.inventory.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//

//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Ecommerce
//  @ File Name : Comment.java
//  @ Date : 11/4/2019
//  @ Author : 
//
//

/** */
@Entity
@Table(name="comment")
public class Comment {
	/**
	 * @return the commentDescription
	 */
	public String getCommentDescription() {
		return commentDescription;
	}

	/**
	 * @param commentDescription
	 *            the commentDescription to set
	 */
	public void setCommentDescription(String commentDescription) {
		this.commentDescription = commentDescription;
	}

	/**
	 * @return the metaData
	 */
	public MetaData getMetaData() {
		return metaData;
	}

	/**
	 * @param metaData
	 *            the metaData to set
	 */
	public void setMetaData(MetaData metaData) {
		this.metaData = metaData;
	}

	/** */
	@Column(name="comment_description")
	private String commentDescription;

	/** */
	@JoinColumn(name="meta_data")
	@OneToOne
	private MetaData metaData;
	
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
