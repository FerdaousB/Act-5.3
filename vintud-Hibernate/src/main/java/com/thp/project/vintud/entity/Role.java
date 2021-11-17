package com.thp.project.vintud.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.thp.project.vintud.entity.impl.RoleImpl;


@Entity 
@Table(name="role")
public class Role implements Serializable {
	
	@Id 
    @GeneratedValue(strategy=GenerationType.AUTO) 
    @Column(name="id")
	private int id ;
	
	@Column(name="nom")
	@NotNull
	private String nom ;
	private List<User> usersForThisRole ;
	
	public Role() {
	}


	public Role(int id, String nom) {
		this.id = id;
		this.nom = nom;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	@Override
	public String toString() {
		return "Role [id=" + id + ", nom=" + nom + "]";
	}
	
	
	

}
