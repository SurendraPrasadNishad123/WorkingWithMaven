package com.mapp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {
	
		Configuration cf=new Configuration();
		cf.configure();
		SessionFactory fc= cf.buildSessionFactory();
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		emp1.seteId(101);
		emp1.seteName("Rabin");
		
		emp2.seteId(103);
		emp2.seteName("Rakeshwaram");
		
		Project pro1=new Project();
		Project pro2=new Project();
		pro1.setpId(111);
		pro1.setpName("Library management system");
		
		pro2.setpId(113);
		pro2.setpName("School management system");
		
		List<Employee> elst=new ArrayList<Employee>();
		elst.add(emp1);
		elst.add(emp2);
		
		
		
		List<Project> plst=new ArrayList<Project>();
		plst.add(pro1);
		plst.add(pro2);
		
		emp1.setProjects(plst);
		emp2.setProjects(plst);
		
		pro1.setEmployees(elst);
		pro2.setEmployees(elst);
		
		
		
		Session session=fc.openSession();
            Transaction tx=session.beginTransaction();
            session.save(emp1);
            session.save(emp2);
            session.save(pro1);
            session.save(pro2);
            
            tx.commit();
            fc.close();
            session.close();
	}

}
