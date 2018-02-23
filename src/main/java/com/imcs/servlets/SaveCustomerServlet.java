package com.imcs.servlets;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imcs.pojo.Customer;
import com.imcs.service.CustomerService;
import com.imcs.service.ICustomerService;
import com.imcs.util.CustomerUtil;

/**
 * Servlet implementation class SaveCustomerServlet
 */
public class SaveCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ICustomerService custService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
        custService=new CustomerService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Customer customer=CustomerUtil.prepareCustomer(request);
			boolean status=custService.saveCustomer(customer);
			if(status){
				response.getWriter().println("Customer Saved into the Database");
			}
			else{
				response.getWriter().println("Error saving into the Database! Please try again");
			}
		} catch (ParseException e) {
			response.getWriter().println("Error saving into the Database! Please try again");
			e.printStackTrace();
		}
	}

}
