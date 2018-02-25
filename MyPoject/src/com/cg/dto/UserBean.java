package com.cg.dto;


import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;

@Entity
@Table(name = "user")
@SuppressWarnings("serial")
public class UserBean implements Serializable {

	@NotNull(message = "First Name cannot be null")
	@Column(name = "firstName" )
	private String firstName;
	
	@NotNull(message = "Last Name cannot be null")
	@Column(name = "lastName")
	private String lastName;

	@NotNull(message = "City cannot be null")
	@Column(name = "city")
	private String city;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
	
}
