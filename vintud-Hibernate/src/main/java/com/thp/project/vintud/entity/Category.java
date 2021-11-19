package com.thp.project.vintud.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity 
@Table(name="categorie")
public class Category implements Serializable{

	 @Id 
     @GeneratedValue(strategy=GenerationType.AUTO) 
     @Column(name="id_categorie")
	private int id ;
	 
	@Column(name="name")
	@NotNull
	private String name  ;
	
	@Column(name="description")
    @NotNull
	private String description  ;
	
	
	public Category() {
	}


	public Category(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	}
