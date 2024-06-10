package Car_accident;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Mapping.Faculty;
import Mapping.Faculty_Subjects;

public class Controller {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		cfg.addAnnotatedClass(Accient.class);
		SessionFactory sc = cfg.buildSessionFactory();
	Session s = sc.openSession();
	         Car c1 = new Car(1,"porshe");        
	         Accient ac1 = new Accient(123,"pune");
	         

	  
	    c1.setAc(ac1);
	      s.save(c1);
	      Transaction t = s.beginTransaction();
	      t.commit();

	    
	}

	
}
