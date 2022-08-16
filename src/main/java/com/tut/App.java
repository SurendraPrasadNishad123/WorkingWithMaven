package com.tut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )throws IOException
    {
        System.out.println( "Project started..." );
       // SessionFactory factory=new Configuration().configure().buildSessionFactory();
        
        Configuration cf=new Configuration();
        cf.configure();
        SessionFactory factory=cf.buildSessionFactory();
        //create object of student
        Student st=new Student();
        st.setId(123);
        st.setName("Amit");
        st.setCity("Bhairahawa");
        System.out.println(st);
        
        //create object of Address class
        Address ad=new Address();
        ad.setStreet("street prabhatpath");
        ad.setCity("Bhairahawa");
        ad.setCountry("Nepal");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(123.123);
        
            //Reading image
		FileInputStream fs=new FileInputStream("src/main/java/Capture5.PNG");
		byte[] data=new byte[fs.available()];
		fs.read(data);
		ad.setImage(data);
	
        
       
        
       Session session= factory.openSession();
       //to save only transaction needed
       Transaction tx=session.beginTransaction();
       
       session.save(st);
       session.save(ad);
      
       tx.commit();
       System.out.println("Done!!");
       
       session.close();
    }
}
