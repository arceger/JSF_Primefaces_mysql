package com.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test_conexao {

	public static void main(String[] args) {
		// Create Configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Empresa.class);

		// Create Session Factory
		SessionFactory sessionFactory
			= configuration.buildSessionFactory();

		// Initialize Session Object
		Session session = sessionFactory.openSession();
		
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("spring_jsf_prime");
	
       EntityManager em = emf.createEntityManager();
	
       List<Empresa> lista = em.createQuery("from Empresa", Empresa.class)
				.getResultList();
	
	System.out.println(lista);
	emf.close();
	em.close();
	session.close();

	}

}
