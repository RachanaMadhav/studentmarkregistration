package org.deloitte.sms.studentmarkregistration.dao.impl;

import org.deloitte.sms.studentmarkregistration.beans.StudentMarkHigher;
import org.deloitte.sms.studentmarkregistration.beans.StudentMarkPrimary;
import org.deloitte.sms.studentmarkregistration.beans.StudentMarkSecondary;
import org.deloitte.sms.studentmarkregistration.dao.StudentMarkDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class StudentMarkDaoImpl implements StudentMarkDao{
	@Autowired
	SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void addMarkPrimary(StudentMarkPrimary primary) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(primary);
		tx.commit();
		session.close();
		}	
		
	
	public void addMarkSecondary(StudentMarkSecondary secondary) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(secondary);
		tx.commit();
		session.close();
		}
	public void addMarkHigher(StudentMarkHigher higher) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(higher);
		tx.commit();
		session.close();

		}
	public String gradeCal(double i) {
		String grd="";
		if(i<50)
		grd="F";
		else if(i>=90)
		grd="A";
		else if(i>=70&&i<90)
		grd="B";
		else if(i>=50&&i<70)
		grd="C";
		return grd;
	}
	public String validationForPrimary(int a, int b, int c, int d) {
		if(a>100||a<0||b>100||b<0||c>100||c<0||d>100||d<0)
			return "false";
		else
			return "true";
	}
	public String validationForSecondary(int a, int b, int c, int d, int e) {
		if(a>100||a<0||b>100||b<0||c>100||c<0||d>100||d<0||e>100||e<0)
			return "false";
		else
			return "true";
	}
	public String validationForHigher(int a, int b, int c, int d, int e, int f) {
		if(a>100||a<0||b>100||b<0||c>100||c<0||d>100||d<0||e>100||e<0||f>100||f<0)
			return "false";
		else
			return "true";
	}

	
	
	
	}



