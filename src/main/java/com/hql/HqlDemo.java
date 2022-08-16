package com.hql;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tut.Student;
public class HqlDemo {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		//Selecting All student
		String query="from Student as s where s.name='Ramesh'";
		//firing query
		Query q=session.createQuery(query);
		//Note When query give single result then
		// q.uniqueResult();
		 
		//When query give multiple result
		List<Student> list= q.list();
		
		//for displayig
		for(Student st:list)
		{
			System.out.println(st.getName()+": "+st.getCert().getCourse()+": "+st.getCity());
		}
	}

}
