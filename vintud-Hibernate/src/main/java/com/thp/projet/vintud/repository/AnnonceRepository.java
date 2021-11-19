package com.thp.projet.vintud.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thp.project.vintud.entity.Announcement;

public interface AnnonceRepository extends JpaRepository<Announcement, Id>{
	

}
