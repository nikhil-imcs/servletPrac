package com.imcs.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imcs.pojo.Customer;
import com.imcs.service.CustomerService;
import com.imcs.service.ICustomerService;

/**
 * Servlet implementation class GetCustomerServlet
 */
public class GetCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ICustomerService custService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
        custService=new CustomerService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer id=Integer.parseInt(request.getParameter("custId"));
		Customer customer=custService.getCustomerById(id);
		response.getWriter().println(customer);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
