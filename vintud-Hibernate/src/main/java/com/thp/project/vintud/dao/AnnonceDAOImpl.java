package com.thp.project.vintud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.thp.project.vintud.entity.Announcement;


@Repository
@Transactional
public class AnnonceDAOImpl implements AnnonceDAO {
	
	
	@PersistenceContext
	private EntityManager entityManager;

	public AnnonceDAOImpl() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Cre_Vin");       
		entityManager = emf.createEntityManager();
	
	}

	@Override
	public void InsertAnnonce(Announcement annonce) {
		
		EntityTransaction  transaction =  entityManager.getTransaction();
		
		transaction.begin();
	 try	{
			entityManager.persist(annonce);
			transaction.commit();

		} catch (Exception E){
			transaction.rollback();
			E.printStackTrace();
			
		}

	}
	@Override
	public List<Announcement> findAllAnnouncements() {

		
		Query query = entityManager.createQuery("Select annonce from Announcement annonce ");
		
		return query.getResultList();
	}

	@Override
	public List<Announcement> findAnnonceByNom(String p) {
		
		Query query = entityManager.createQuery("Select annonce from Announcement annonce where annonce.nom like :x ");
		query.setParameter("x", "%"+ p + "%");
		return query.getResultList();
	}

	@Override
	public Announcement findAnnonceByPrice(String p) {

		return null;
	}

	@Override
	public Announcement findAnnonceByLocation(String l) {

		return null;
	}

	

	@Override
	public Announcement findByNombtrView(int nb_V) {

		return null;
	}

	@Override
	public void UpdateAnnonce(Announcement annonce) {


	}

	@Override
	public void DeleteAnnonce(Announcement annonce) {


	}

}
