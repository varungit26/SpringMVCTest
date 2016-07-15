package com.ck.rewards.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "user_id")
	private int userId;

	@NotEmpty
	@Size(min = 2, max = 30)
	@Column(name = "username")
	private String userName;

	@NotEmpty
	@Size(min = 2, max = 15)
	@Column(name = "first_name")
	private String firstName;

	@Size(min = 1, max = 20)
	@Column(name = "last_name")
	private String lastName;

	@Size(min = 2, max = 15)
	@Column(name = "password")
	private String password;

	// bi-directional many-to-one association to Address
	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private List<Address> address;

	// bi-directional many-to-one association to Profile
	@OneToMany(mappedBy = "user", cascade=CascadeType.ALL)
	private List<Profile> profiles;

	// bi-directional many-to-one association to Store
	@ManyToOne
	private Store store;

	public User() {
	}

	/**
	 * 
	 * Getters and Setters.
	 */
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Address> getAddress() {
		return this.address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Address addAddress(Address address) {
		getAddress().add(address);
		address.setUser(this);

		return address;
	}

	public Address removeAddress(Address address) {
		getAddress().remove(address);
		address.setUser(null);

		return address;
	}

	public List<Profile> getProfiles() {
		return this.profiles;
	}

	public void setProfiles(List<Profile> profiles) {
		this.profiles = profiles;
	}

	public Profile addProfile(Profile profile) {
		getProfiles().add(profile);
		profile.setUser(this);

		return profile;
	}

	public Profile removeProfile(Profile profile) {
		getProfiles().remove(profile);
		profile.setUser(null);

		return profile;
	}

	public Store getStore() {
		return this.store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

}