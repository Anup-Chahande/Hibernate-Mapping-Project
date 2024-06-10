package Mapping;

import java.util.ArrayList;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Controller {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Faculty.class);
	cfg.addAnnotatedClass(Faculty_Subjects.class);
	SessionFactory sc = cfg.buildSessionFactory();
Session s = sc.openSession();
         Faculty f1 = new Faculty(1,"anup");        
        Faculty_Subjects fs1 =new  Faculty_Subjects(1,"java");
        Faculty_Subjects fs2 =new  Faculty_Subjects(2,"python");

        ArrayList<Faculty_Subjects> al  =  new  ArrayList<>(); 
    al.add(fs1);
    al.add(fs2);
    
    f1.setFs(al);
      s.save(f1);
      Transaction t = s.beginTransaction();
      t.commit();

    
}

}
