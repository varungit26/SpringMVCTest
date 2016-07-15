package com.ck.rewards.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the income database table.
 * 
 */
@Entity
@NamedQuery(name="Income.findAll", query="SELECT i FROM Income i")
public class Income implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String value;

	//bi-directional many-to-one association to Profile
	@OneToMany(mappedBy="income", fetch=FetchType.EAGER)
	private List<Profile> profiles;

	public Income() {
	}
	
	/**
	 * 
	 * Getters and Setters.
	 */

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<Profile> getProfiles() {
		return this.profiles;
	}

	public void setProfiles(List<Profile> profiles) {
		this.profiles = profiles;
	}

	public Profile addProfile(Profile profile) {
		getProfiles().add(profile);
		profile.setIncome(this);

		return profile;
	}

	public Profile removeProfile(Profile profile) {
		getProfiles().remove(profile);
		profile.setIncome(null);

		return profile;
	}

}