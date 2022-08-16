package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StateDemo {

	public static void main(String[] args) {
		
	Configuration cf=new Configuration();
	cf.configure();
	SessionFactory sf= cf.buildSessionFactory();
	
	Student st=new Student();
	st.setId(122);
	st.setName("Abhshar Sharma");
	st.setCert(new Certificate("Java Maven Project","7months"));
	//Transient State---------------
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	session.save(st);
	st.setName("Ramesh");//it save in db
	tx.commit();
	//Persistence State---------------

	sf.close();
	session.close();
	//Detached State-------------
	
	}

}
