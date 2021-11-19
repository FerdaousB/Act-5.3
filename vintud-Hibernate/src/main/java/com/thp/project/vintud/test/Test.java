package com.thp.project.vintud.test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.thp.projet.vintud.repository.AnnonceRepository;

public class Test {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Cre_Vin");
		
	//	AnnonceRepository annonceRepository = context.getBean(AnnonceRepository.class);

	}

}
