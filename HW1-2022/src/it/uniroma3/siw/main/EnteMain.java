package it.uniroma3.siw.main;

import javax.persistence.*;

public class EnteMain {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("museo-unit");
		EntityManager em = emf.createEntityManager();
		
		em.close();
		emf.close();
		}



}
