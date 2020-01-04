package com.mindtree.bankApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mindtree.bankApplication.dto.CustomerDto;
import com.mindtree.bankApplication.dto.DebitCardDto;
import com.mindtree.bankApplication.service.CustomerService;

@Controller
public class MyAppController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/index")
	public String menu() {
		return "home";
	}

	@RequestMapping("customer")
	public String insertCustomer() {
		return "customerdetails";
	}

	@RequestMapping("customerdet")
	public String addcustomer(CustomerDto customerDto) {
		customerService.addCustomerDetails(customerDto);
		return "customerdetails";
	}

	@RequestMapping("debitcard")
	public String insertDebitCard(Model model) {
		List<CustomerDto> customerdto = customerService.getAllCustomers();
		model.addAttribute("customer", customerdto);
		return "debitcarddetails";
	}

	@RequestMapping("debitcarddet")
	public String addDebitCard(@ModelAttribute DebitCardDto debitCardDto, int customerId) {

		customerService.addDebitCardDetails(debitCardDto, customerId);
		return "home";
	}

	@RequestMapping("/view")
	public String viewDetails(Model model) {
		List<CustomerDto> customers = customerService.getAllCustomersBasedOnCardCount();
		model.addAttribute("customers", customers);
		return "viewdetails";
	}
}
