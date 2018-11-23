package com.model;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.pojo.Emp;
public class b1 {
	SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

	
	public List<Emp> get()
	{
		Session s=sf.openSession();
	Criteria cr=s.createCriteria(Emp.class);
	List<Emp> l=cr.list();
	return l;
	}
	
	
	
	
}
