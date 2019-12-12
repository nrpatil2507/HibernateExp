package demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		
	Emp e=new Emp();
	e.setId(1);
	e.setName("Nutan");
	e.setCmpname("axelor");
		
	Configuration cn=new Configuration();
	cn.configure("demo/hibernate.cfg.xml");
	SessionFactory sf=cn.buildSessionFactory();
	
	Session s=sf.openSession();
	Transaction tx=s.beginTransaction();

	s.save(e);
	tx.commit();
	
	}

}
