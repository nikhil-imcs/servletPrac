package com.imcs.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.imcs.dao.HibernateUtils;
import com.imcs.pojo.Customer;

public class CustomerDao implements ICustomerDao {

	private Session getSession() {
		return HibernateUtils.getSessionFactory().openSession();
	}

	public Customer getCustomerById(Integer id) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			Customer customer = (Customer) session.get(Customer.class, id);
			transaction.commit();
			return customer;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}

	public boolean saveCustomer(Customer customer) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(customer);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			return false;
		} finally {
			session.close();
		}
	}

}
