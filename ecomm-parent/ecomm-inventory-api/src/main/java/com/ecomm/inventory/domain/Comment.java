package com.ecomm.inventory.domain;

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
	private String commentDescription;

	/** */
	private MetaData metaData;
}
