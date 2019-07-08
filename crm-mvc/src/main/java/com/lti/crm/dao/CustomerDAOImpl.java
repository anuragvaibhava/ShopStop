package com.lti.crm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.crm.model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveCustomer(Customer theCustomer) {
	
		Session currentSession =sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theCustomer);

	}

}
