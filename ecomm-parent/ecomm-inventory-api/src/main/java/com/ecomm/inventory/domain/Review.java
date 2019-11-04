package com.ecomm.inventory.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Ecommerce
//  @ File Name : Review.java
//  @ Date : 11/4/2019
//  @ Author : 
//
//




/** */
@Entity
@Table(name="review")
public class Review {
	/**
	 * @return the rating
	 */
	public Rating getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(Rating rating) {
		this.rating = rating;
	}

	/**
	 * @return the comment
	 */
	public Comment getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(Comment comment) {
		this.comment = comment;
	}

	/**
	 * @return the replyComments
	 */
	public List<Comment> getReplyComments() {
		return replyComments;
	}

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

	/**
	 * @param replyComments the replyComments to set
	 */
	public void setReplyComments(List<Comment> replyComments) {
		this.replyComments = replyComments;
	}
	
	@Id
   @Column(name="id")
	private Integer id;
	/** */
	 @Column(name="rating")
	 @OneToOne
	private Rating rating;
	
	/** */
	@Column(name="comment")
	@OneToOne
	private Comment comment;
	
	/** */
	@Column(name="reply-comment")
	@OneToMany
	private List<Comment> replyComments;
}
