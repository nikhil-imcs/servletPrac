package com.imcs.dao;

import com.imcs.pojo.Customer;

public interface ICustomerDao {

	Customer getCustomerById(Integer id);

	boolean saveCustomer(Customer customer);

}
