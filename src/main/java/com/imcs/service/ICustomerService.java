package com.imcs.service;

import com.imcs.pojo.Customer;

public interface ICustomerService {

	Customer getCustomerById(Integer id);

	boolean saveCustomer(Customer customer);
}
