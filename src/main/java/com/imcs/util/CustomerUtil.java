package com.imcs.util;

import java.text.ParseException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.time.DateUtils;

import com.imcs.pojo.Customer;

public class CustomerUtil {
	
	public static Customer prepareCustomer(HttpServletRequest request) throws ParseException{
		Customer customer=new Customer();
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String email=request.getParameter("email");
		String company=request.getParameter("company");
		Double salary=Double.parseDouble(request.getParameter("salary"));
		Date dob=DateUtils.parseDate(request.getParameter("dob"), "yyyy-MM-dd");
		
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setEmail(email);
		customer.setSalary(salary);
		customer.setDob(dob);
		customer.setCompany(company);
		
		return customer;
	}

}
