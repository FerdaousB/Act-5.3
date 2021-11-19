package com.thp.project.vintud.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.thp.project.vintud.entity.Announcement;

@Repository
public interface AnnonceDAO {
	
	 public List<Announcement> findAllAnnouncements();
	 public List<Announcement> findAnnonceByNom(String p);
	 public Announcement findAnnonceByPrice(String p);
	 public Announcement findAnnonceByLocation(String l);
     public void InsertAnnonce(Announcement annonce);
     public Announcement findByNombtrView(int nb_V);
	 public void UpdateAnnonce(Announcement annonce);
	 public void DeleteAnnonce(Announcement annonce);

}
