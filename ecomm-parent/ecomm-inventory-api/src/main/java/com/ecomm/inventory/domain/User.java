/**
 * 
 */
package com.ecomm.inventory.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Adarsh
 *
 */
@Entity
@Table(name="user")
public class User {
	
/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

@Column(name="username")
private String userName;

@Column(name="id")
@Id
private Integer id;
}
