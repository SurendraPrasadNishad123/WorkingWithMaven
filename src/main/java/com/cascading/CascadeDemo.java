package com.cascading;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.mapping.Answers;
import com.mapping.Question1ToMany;

public class CascadeDemo {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		org.hibernate.Transaction txt=session.beginTransaction();
		
		Question1ToMany q=new Question1ToMany();
		q.setQue_Id(127);
		q.setQuestion("What is Hibernate?");
		
		Answers ans=new Answers(563,"It is a Java language.", q);
		Answers ans1=new Answers(564,"It is an ORM.", q);
		
		
		
		List <Answers> lst=new ArrayList<Answers>();
		lst.add(ans);
		lst.add(ans1);
		
		q.setAnswers(lst);
		session.save(q);
		//using cascading  so dont need  question is save so no need to save other rel entity
		//session.save(ans);
		//session.save(ans1);
		//session.save(ans2);
		txt.commit();
		
		factory.close();
		session.close();
		
		

	}

}
