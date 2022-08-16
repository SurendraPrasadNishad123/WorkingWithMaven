package NativeSql;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.tut.Student;

public class SqlDemo {

	public static void main(String[] args) 
	{
		Configuration cf=new Configuration();
		cf.configure();
		SessionFactory factory=cf.buildSessionFactory();
		String q="select * from student";
		
		
		Session session=factory.openSession();
		
	NativeQuery nq	=session.createSQLQuery(q);
		//Transaction txt=session.beginTransaction();
	List<Object []> list=nq.list();
	
	for(Object [] st:list) 
	{
		System.out.println(st[1]+":"+st[2]+": "+st[4]);
	}
	}
}
