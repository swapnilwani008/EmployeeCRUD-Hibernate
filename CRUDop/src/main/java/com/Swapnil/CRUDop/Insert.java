
package com.Swapnil.CRUDop;

import org.hibernate.Session;
//import org.hibernate.SessionFactory;
import com.Entity.Employee;
import com.Utility.HibernateUtil1;

public class Insert {
	public static void main(String args[]) {
//		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session ses = HibernateUtil1.getSession();
		try {
			ses.beginTransaction();
			Employee emp = new Employee("Ram", "AWS Trainer", 50000.00);
		
			Employee empl=new Employee ("shakar", "AWS Trainer", 50000.00);
			Employee emp2=new Employee ("Prem", "OA", 10000.00);
			Employee emp3=new Employee ("Yatin", "BA", 20000.00);
			Employee emp4=new Employee ("Aakash", "Management", 30000.00);
			Employee emp5=new Employee ("Swaraj", "Admin", 40000.00);
			ses.save(empl);
			ses.save (emp2);
			ses.save(emp3);
			ses.save(emp4);
			ses.save(emp5);
			ses.save(emp);
			ses.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}