package com.ecomm.inventory.domain;

import java.math.BigDecimal;
import java.util.List;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Ecommerce
//  @ File Name : Product.java
//  @ Date : 11/4/2019
//  @ Author : 
//
//




/** */
public class Product {
	/** */
	private String name;
	
	/** */
	private String description;
	
	/** */
	private List<Review> reviews;
	
	/** */
	private List<String> keyFeatures;
	
	/** */
	private List<String> images;
	
	/** */
	private List<String> categories;
	
	/** */
	private Enum rating;
	
	/** */
	private BigDecimal price;
	
	/** */
	private int discountPercent;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the reviews
	 */
	public List<Review> getReviews() {
		return reviews;
	}

	/**
	 * @param reviews the reviews to set
	 */
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	/**
	 * @return the keyFeatures
	 */
	public List<String> getKeyFeatures() {
		return keyFeatures;
	}

	/**
	 * @param keyFeatures the keyFeatures to set
	 */
	public void setKeyFeatures(List<String> keyFeatures) {
		this.keyFeatures = keyFeatures;
	}

	/**
	 * @return the images
	 */
	public List<String> getImages() {
		return images;
	}

	/**
	 * @param images the images to set
	 */
	public void setImages(List<String> images) {
		this.images = images;
	}

	/**
	 * @return the categories
	 */
	public List<String> getCategories() {
		return categories;
	}

	/**
	 * @param categories the categories to set
	 */
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	/**
	 * @return the rating
	 */
	public Enum getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(Enum rating) {
		this.rating = rating;
	}

	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * @return the discountPercent
	 */
	public int getDiscountPercent() {
		return discountPercent;
	}

	/**
	 * @param discountPercent the discountPercent to set
	 */
	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}

	/**
	 * @return the tags
	 */
	public List<String> getTags() {
		return tags;
	}

	/**
	 * @param tags the tags to set
	 */
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	/**
	 * @return the metaData
	 */
	public MetaData getMetaData() {
		return metaData;
	}

	/**
	 * @param metaData the metaData to set
	 */
	public void setMetaData(MetaData metaData) {
		this.metaData = metaData;
	}

	/** */
	private List<String> tags;
	
	/** */
	private MetaData metaData;
}