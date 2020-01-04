package com.mindtree.bankApplication.dto;

import java.util.List;

public class CustomerDto implements Comparable<CustomerDto> {

	private int customerId;

	private String customerName;

	private int age;

	private List<DebitCardDto> debitCards;

	public CustomerDto() {
		super();
	}

	public CustomerDto(int customerId, String customerName, int age, List<DebitCardDto> debitCards) {
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

	public List<DebitCardDto> getDebitCards() {
		return debitCards;
	}

	public void setDebitCards(List<DebitCardDto> debitCards) {
		this.debitCards = debitCards;
	}

	@Override
	public String toString() {
		return "CustomerDto [customerId=" + customerId + ", customerName=" + customerName + ", age=" + age
				+ ", debitCards=" + debitCards + "]";
	}

	@Override
	public int compareTo(CustomerDto customer) {
		int count = customer.getDebitCards().size()-this.getDebitCards().size();
		return count;
	}

}
