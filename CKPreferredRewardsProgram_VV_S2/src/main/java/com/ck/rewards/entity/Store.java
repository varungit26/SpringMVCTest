package com.ck.rewards.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CKStore Entity class
 *
 */
@Entity
@Table(name = "store")
public class Store {

	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int storeID;

	@Column(name = "name")
	private String name;

	@Column(name = "address_line1")
	private String addressLine1;

	@Column(name = "address_line2")
	private String addressLine2;

	@Column(name = "city")
	private String city;

	@Column(name = "zip")
	private String zip;

	@Column(name = "state_id")
	private int state;

	@Column(name = "country_id")
	private int country;

	// @Transient
	// private ArrayList<Store> storeList;

	public int getStoreID() {
		return storeID;
	}

	/**
	 * 
	 * Getters and Setters.
	 */
	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
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

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getCountry() {
		return country;
	}

	public void setCountry(int country) {
		this.country = country;
	}

	// public ArrayList<Store> getStoreList() {
	// return storeList;
	// }

	// public void setStoreList(ArrayList<Store> storeList) {
	// this.storeList = storeList;
	// }

}
