package productinfo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Insertdata {

public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtil.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction ts=session.beginTransaction();
		
		Product1 c=new Product1();
		
		c.setItem("hihwe");
		c.setPrize(488);
		c.setId(4);
		session.save(c);
		ts.commit();
		System.out.println("Data inserted successfully");
	}
}
