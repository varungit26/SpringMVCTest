package com.ck.rewards.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the state database table.
 * 
 */
@Entity
@NamedQuery(name = "State.findAll", query = "SELECT s FROM State s")
public class State implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	// bi-directional many-to-one association to Address
	@OneToMany(mappedBy = "state", fetch = FetchType.EAGER)
	private List<Address> addresses;

	public State() {
	}

	/**
	 * 
	 * Getters and Setters.
	 */
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public Address addAddress(Address address) {
		getAddresses().add(address);
		address.setState(this);

		return address;
	}

	public Address removeAddress(Address address) {
		getAddresses().remove(address);
		address.setState(null);

		return address;
	}

}