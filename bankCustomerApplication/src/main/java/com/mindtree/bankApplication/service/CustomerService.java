package com.mindtree.bankApplication.service;

import java.util.List;

import com.mindtree.bankApplication.dto.CustomerDto;
import com.mindtree.bankApplication.dto.DebitCardDto;

public interface CustomerService {

	/**
	 * @return list of customer details
	 */
	
	public String addCustomerDetails(CustomerDto customerDto);

	/**
	 * @param debitCardDto
	 * @param customerId
	 * @return string message
	 */
	
	public String addDebitCardDetails(DebitCardDto debitCardDto, int customerId);

	/**
	 * @return list of customers
	 */
	public List<CustomerDto> getAllCustomers();

	/**
	 * @return customer Details
	 */
	
	public List<CustomerDto> getAllCustomersBasedOnCardCount();

}
