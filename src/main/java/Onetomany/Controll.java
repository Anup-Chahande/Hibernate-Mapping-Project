package Onetomany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Controll {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Player.class);
	cfg.addAnnotatedClass(Skills.class);
	SessionFactory sf = cfg.buildSessionFactory();
        Session s  = sf.openSession();
        Player p1 = new Player(7,"Dhoni");
        Skills s1 = new Skills("Batsman");
        Skills s2 = new Skills("Kepper");
        ArrayList<Skills> skilss = new ArrayList<>();
        skilss.add(s1);
        skilss.add(s2);
        p1.setPlyr(skilss);
        s.save(p1);
        Transaction t = s.beginTransaction();
        t.commit();
        
}
}
