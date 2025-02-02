package com.ck.rewards.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * The persistent class for the profile database table.
 * 
 */
@Entity
@NamedQuery(name = "Profile.findAll", query = "SELECT p FROM Profile p")
public class Profile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@NotEmpty
	@Column(name = "gender")
	private String gender;

	@NotEmpty
	@Column(name = "status")
	private String maritalStatus;

	@NotEmpty
	@Column(name = "birth_date")
	private String birthDay;

	@NotEmpty
	@Column(name = "birth_month")
	private String birthMonth;

	@NotEmpty
	@Column(name = "sub_rewards")
	private String subscriptionRewards;

	@NotEmpty
	@Column(name = "sub_stores")
	private String subscriptionStore;

	@NotEmpty
	@Column(name = "sub_website")
	private String subscriptionEmail;

	// bi-directional many-to-one association to Income
	@ManyToOne
	private Income income;

	// bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Profile() {
	}

	/**
	 * 
	 * Getters and Setters.
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}

	public String getSubscriptionRewards() {
		return subscriptionRewards;
	}

	public void setSubscriptionRewards(String subscriptionRewards) {
		this.subscriptionRewards = subscriptionRewards;
	}

	public String getSubscriptionStore() {
		return subscriptionStore;
	}

	public void setSubscriptionStore(String subscriptionStore) {
		this.subscriptionStore = subscriptionStore;
	}

	public String getSubscriptionEmail() {
		return subscriptionEmail;
	}

	public void setSubscriptionEmail(String subscriptionEmail) {
		this.subscriptionEmail = subscriptionEmail;
	}

	public Income getIncome() {
		return income;
	}

	public void setIncome(Income income) {
		this.income = income;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}