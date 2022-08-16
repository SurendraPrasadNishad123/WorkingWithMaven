package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbedDemo {

	public static void main(String[] args) {
		
		  Configuration cf=new Configuration();
	        cf.configure();
	        SessionFactory factory=cf.buildSessionFactory();
	        
	        Student st1=new Student();
	        st1.setName("Suraj");
	        st1.setCity("Kathmandu");
	        st1.setId(56);
	        Certificate ct1=new Certificate();
	        ct1.setCourse("Computer Science");
	        ct1.setDuration("6month");
	        st1.setCert(ct1);
	        
	        Student st2=new Student();
	        st2.setName("Vikash");
	        st2.setCity("Butwal");
	        st2.setId(57);
	        Certificate ct2=new Certificate();
	        ct2.setCourse("Mechanical Science");
	        ct2.setDuration("6.5 month");
	        st2.setCert(ct2);
	        
	        Session session= factory.openSession();
	        //to save only transaction needed
	        Transaction tx=session.beginTransaction();
	        
	        session.save(st1);
	        session.save(st2);
	       
	        tx.commit();
	        System.out.println("Done!!");

	}

}
