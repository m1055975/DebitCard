package com.mindtree.bankApplication.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DebitCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int DId;

	private long dcNumber;

	private Date expiryDate;

	private double amount;

	private String cardType;

	public DebitCard() {
		super();

	}

	public DebitCard(int dId, long dcNumber, Date expiryDate, double amount, String cardType) {
		super();
		DId = dId;
		this.dcNumber = dcNumber;
		this.expiryDate = expiryDate;
		this.amount = amount;
		this.cardType = cardType;
	}

	public int getDId() {
		return DId;
	}

	public void setDId(int dId) {
		DId = dId;
	}

	public long getDcNumber() {
		return dcNumber;
	}

	public void setDcNumber(long dcNumber) {
		this.dcNumber = dcNumber;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	@Override
	public String toString() {
		return "DebitCard [DId=" + DId + ", dcNumber=" + dcNumber + ", expiryDate=" + expiryDate + ", amount=" + amount
				+ ", cardType=" + cardType + "]";
	}

}
