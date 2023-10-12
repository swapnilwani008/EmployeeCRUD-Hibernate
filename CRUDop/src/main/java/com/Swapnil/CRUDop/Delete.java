
package com.Swapnil.CRUDop;

import org.hibernate.Session;
//import org.hibernate.SessionFactory;
import com.Entity.Employee;
import com.Utility.HibernateUtil1;

public class Delete {
	public static void main(String args[]) {
//		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session ses = HibernateUtil1.getSession();
		try {
			ses.beginTransaction();
			Employee emp = ses.get(Employee.class, 1);
			
			ses.delete(emp);
			ses.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}