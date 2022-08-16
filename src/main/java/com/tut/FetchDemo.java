package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
  public static void main(String[] args) 
  {

      Configuration cf=new Configuration();
      cf.configure();
      SessionFactory factory=cf.buildSessionFactory();
      
      Session session=factory.openSession();
      //session get/load student with id 123
     Student student= (Student)session.load(Student.class, 123);
     System.out.println(student);
     
     //session get/load Address with id 1
     Address address= (Address)session.get(Address.class, 1);
     System.out.println(address.getCity());
      
      session.close();
      factory.close();
  } 
}
