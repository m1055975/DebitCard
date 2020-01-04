package com.mindtree.bankApplication.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;

	private String customerName;

	private int age;

	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinColumn(name = "customer_Id")
	private List<DebitCard> debitCards;

	public Customer() {
		super();

	}

	public Customer(int customerId, String customerName, int age, List<DebitCard> debitCards) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.age = age;
		this.debitCards = debitCards;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<DebitCard> getDebitCards() {
		return debitCards;
	}

	public void setDebitCards(List<DebitCard> debitCards) {
		this.debitCards = debitCards;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", age=" + age
				+ ", debitCards=" + debitCards + "]";
	}

}
