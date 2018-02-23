package com.imcs.service;

import com.imcs.dao.CustomerDao;
import com.imcs.dao.ICustomerDao;
import com.imcs.pojo.Customer;

public class CustomerService implements ICustomerService {
	
	ICustomerDao custDao=new CustomerDao();

	public Customer getCustomerById(Integer id) {
		Customer customer=custDao.getCustomerById(id);
		return customer;
	}

	public boolean saveCustomer(Customer customer) {
		boolean status=custDao.saveCustomer(customer);
		return status;
	}

}
