package com.ck.rewards.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * The persistent class for the address database table.
 * 
 */
@Entity
@NamedQuery(name = "Address.findAll", query = "SELECT a FROM Address a")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@NotEmpty
	@Size(min = 2, max = 30)
	@Column(name = "line1")
	private String address1;

	@NotEmpty
	@Size(min = 2, max = 30)
	@Column(name = "line2")
	private String address2;

	@NotEmpty
	@Column(name = "city")
	private String city;

	@NotEmpty
	@Column(name = "zip")
	private String zip;

	@NotEmpty
	@Email
	@Column(name = "email")
	private String email;

	@NotEmpty
	@Column(name = "phone")
	private String phone;

	// bi-directional many-to-one association to State
	@ManyToOne
	private State state;

	// bi-directional many-to-one association to Country
	@ManyToOne
	private Country country;

	// bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	/**
	 * 
	 * Getters and Setters.
	 */

	public Address() {
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}