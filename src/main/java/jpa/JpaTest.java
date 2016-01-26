package jpa;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import domain.Chauffage;
import domain.ElectronicDevices;
import domain.Person;
import domain.Residence;

public class JpaTest {

	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
		EntityManager manager41 = factory.createEntityManager();

		JpaTest test = new JpaTest(manager41);

		EntityTransaction tx = manager41.getTransaction();
		tx.begin();
//		test.afficheProprioResidence();
		try {

//			
//			 Person p = new Person();
//			 p.setNom("martin2");
//			 p.setMail("jj@f.l");
//			 p.setPrenom("per");
//			
//			
//			
//			 Residence r = new Residence();
//			 r.setNbPieces(4);
//			 r.setTaille(3);
//			 r.setProprio(p);
//			
//			 Chauffage c1= new Chauffage();
//			 c1.setResidence(r);
////			 c1.setMarque("fagor");
//			 Chauffage c2 = new Chauffage();
//			 c2.setResidence(r);
////			 c2.setMarque("fagor");
//			
//			 ElectronicDevices ed = new ElectronicDevices();
//			 ed.setProprio(p);
//			 ed.setConsommation(2);
//			 ElectronicDevices ed2 = new ElectronicDevices();
//			 ed2.setProprio(p);
//			 ed2.setConsommation(3);
//			
//			 manager41.persist(r);
//			 manager41.persist(c1);
//			 manager41.persist(c2);
//			 manager41.persist(ed);
//			 manager41.persist(ed2);
			

			Person p = new Person();
			p.setNom("Ibn Mrabet");
			p.setMail("ibnachraf@gm.com");
			p.setPrenom("Achraf");

			Residence r = new Residence();
			r.setNbPieces(10);
			r.setTaille(200);
			r.setProprio(p);

			Chauffage c1 = new Chauffage();
			c1.setResidence(r);
			Chauffage c2 = new Chauffage();
			c2.setResidence(r);

			ElectronicDevices ed = new ElectronicDevices();
			ed.setProprio(p);
			ed.setConsommation(2);
			ElectronicDevices ed2 = new ElectronicDevices();
			ed2.setProprio(p);
			ed2.setConsommation(3);

			manager41.persist(r);
			manager41.persist(c1);
			manager41.persist(c2);
			manager41.persist(ed);
			manager41.persist(ed2);

		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();
		// String s = "SELECT e FROM Person as e where e.name=:name";

		// Query q = manager.createQuery(s,Person.class);
		// q.setParameter("name", "martin");
		// List<Person> res = q.getResultList();

		// System.err.println(res.size());
		// System.err.println(res.get(0).getName());

		manager41.close();
		factory.close();
	}

	public void afficherAll() {
		String s = "select p from Person as p ";
		Query q = manager.createQuery(s);
		List<Person> list = q.getResultList();
		Iterator<Person> it = list.iterator();

		while (it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getNom());
			System.out.println(p.getMail());
			System.out.println(p.getPrenom());
		}
	}

	public void afficheProprioResidence() {
		String s = "select p from Person as p join p.residences as r where r.taille=3";
		Query q = manager.createQuery(s);
		List<Person> list = q.getResultList();
		Iterator<Person> it = list.iterator();

		while (it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getNom());
			System.out.println(p.getMail());
			System.out.println(p.getPrenom());
		}
		
	}

}
