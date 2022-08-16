package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToOneMappingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory fact=cfg.buildSessionFactory();
		
		Question1ToMany que=new Question1ToMany();
		que.setQue_Id(155);
		que.setQuestion("What is programming language?");
		
		Answers ans=new Answers();
		ans.setAnsId(336);
		ans.setAnswers("A language that is human native but when compile understand by computer");
		ans.setQuestion(que);
	    
		Answers ans1=new Answers();
		ans1.setAnsId(337);
		ans1.setAnswers("A programming language is a "
				+ "vocabulary and set of grammatical rules "
				+ "for instructing a computer or computing "
				+ "device to perform specific task.");
		ans1.setQuestion(que);
		
		List<Answers> lst=new ArrayList<Answers>();
		lst.add(ans);
		lst.add(ans1);
		
		que.setAnswers(lst);
		
		
		Session session=fact.openSession();
		
		Transaction trans=session.beginTransaction();
		
		session.save(que);
		session.save(ans);
		session.save(ans1);
		//Lazy loading
		Question1ToMany q=(Question1ToMany) session.get(Question1ToMany.class,155);
		System.out.println(q.getQuestion());
		System.out.println(q.getQue_Id());
		trans.commit();
		fact.close();
		session.close();
	}

}
