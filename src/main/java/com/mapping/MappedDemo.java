package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappedDemo {
public static void main(String[] args) 
{
	 Configuration cf=new Configuration();
     cf.configure();
     SessionFactory factory=cf.buildSessionFactory();
     
     //creating Question object
     Question que=new Question();
     que.setQuestionId(432);
     que.setQuestion("What is class?");
    
     
   //creating Answer object
     Answer ans=new Answer();
     ans.setAnswerId(554);
     ans.setAnswer("A type is define as class that reference to another type.");
     que.setAnswer(ans);
     
     //creating Question object
     Question que1=new Question();
     que1.setQuestionId(433);
     que1.setQuestion("What is Java?");
    
     
   //creating Answer object
     Answer ans1=new Answer();
     ans1.setAnswerId(555);
     ans1.setAnswer("A java is a programming Language.");
     que1.setAnswer(ans1);
     
     
     Session session= factory.openSession();
     //to save only transaction needed
     Transaction tx=session.beginTransaction();
     
     session.save(que);
     session.save(que1);
     session.save(ans);
     session.save(ans1);
     
    
     tx.commit();
     System.out.println("Done!!");
     factory.close();
     session.close();
}
}
