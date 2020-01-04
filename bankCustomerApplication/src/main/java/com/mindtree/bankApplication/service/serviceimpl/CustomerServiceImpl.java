package com.mindtree.bankApplication.service.serviceimpl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bankApplication.dto.CustomerDto;
import com.mindtree.bankApplication.dto.DebitCardDto;
import com.mindtree.bankApplication.entity.Customer;
import com.mindtree.bankApplication.entity.DebitCard;
import com.mindtree.bankApplication.repository.CustomerRepository;
import com.mindtree.bankApplication.repository.DebitCardRepository;
import com.mindtree.bankApplication.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private DebitCardRepository debitCardRepository;

	private ModelMapper mapper = new ModelMapper();

	@Override
	public String addCustomerDetails(CustomerDto customerDto) {
		Customer customer = mapper.map(customerDto, Customer.class);
		customerRepository.save(customer);
		return "inserted";
	}

	@Override
	public String addDebitCardDetails(DebitCardDto debitCardDto, int customerId) {

		Customer customers = customerRepository.findById(customerId).get();
		DebitCard debitCard = mapper.map(debitCardDto, DebitCard.class);

		customers.getDebitCards().add(debitCard);
		debitCardRepository.save(debitCard);
		customerRepository.save(customers);
		return "inserted";
	}

	@Override
	public List<CustomerDto> getAllCustomers() {

		List<CustomerDto> customerdto = customerRepository.findAll().stream().map(i -> mapper.map(i, CustomerDto.class))
				.collect(Collectors.toList());
		return customerdto;
	}

	@Override
	public List<CustomerDto> getAllCustomersBasedOnCardCount() {
		List<CustomerDto> customerDtoList = customerRepository.findAll().stream()
				.map(i -> mapper.map(i, CustomerDto.class)).collect(Collectors.toList());
		Collections.sort(customerDtoList);
		return customerDtoList;
	}

}
