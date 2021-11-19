package com.thp.project.vintud.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity //Permet d'indiquer qu'il s'agit d'une classe que l'on souhaite persister
@Table(name="annonce") //Indique le nom de la table dans la base de données
public class Announcement implements  Serializable{

	
	@Id  //Indique qu'il s'agit de la clé primaire
    @GeneratedValue(strategy=GenerationType.AUTO) //Indique comment la clé doit être généré
    @Column(name="id_announce")
	private int id ;
	
	@Column(name="title")
    @NotNull//On indique que ca ne doit pas être vide
	private String title;
	@Column(name="description")
    @NotNull
	private String description  ;
	
	@ManyToOne  
	@JoinColumn( name="id_categorie" )
	private Category category;
	
	@Column(name="price")
    @NotNull
	private double price;
	
	@Column(name="picture")
    @NotNull   
	private byte[] picture;
	
	@Column(name="publication_date")
    @NotNull
	private String publication_date ; 
	
	@Column(name="is_available")
    @NotNull
	private boolean  is_available;
	
	@Column(name="view_number")
    @NotNull
	private int view_number;
	
	@Column(name="localisation")
    @NotNull
	private String localisation;
	
	@ManyToOne(fetch=FetchType.LAZY) 
	@JoinColumn( name="id_user" )
	private User user;
	
	
	public Announcement() {
	}


	public Announcement(int id, String title, String description, double price, byte[] picture,
	    String publication_date, boolean is_available, int view_number, String localisation) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.picture = picture;
		this.publication_date = publication_date;
		this.is_available = is_available;
		this.view_number = view_number;
		this.localisation = localisation;
		
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(picture);
		result = prime * result + Objects.hash(description, id, is_available, localisation, price,
				publication_date, title,  view_number);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Announcement other = (Announcement) obj;
		return  Objects.equals(description, other.description) && id == other.id
				&& is_available == other.is_available && Objects.equals(localisation, other.localisation)
				&& Arrays.equals(picture, other.picture)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(publication_date, other.publication_date) && Objects.equals(title, other.title)
			    && view_number == other.view_number;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double d) {
		this.price = d;
	}


	public byte[] getPicture() {
		return picture;
	}


	public void setPicture(byte[] picture) {
		this.picture = picture;
	}


	public String getPublication_date() {
		return publication_date;
	}


	public void setPublication_date(String string) {
		this.publication_date = string;
	}


	public boolean getIs_available() {
		return is_available;
	}


	public void setIs_available(boolean is_available) {
		this.is_available = is_available;
	}


	public int getView_number() {
		return view_number;
	}


	public void setView_number(int view_number) {
		this.view_number = view_number;
	}


	public String getLocalisation() {
		return localisation;
	}


	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}


	

	@Override
	public String toString() {
		return "Announcement [id=" + id + ", title=" + title + ", description=" + description + ", price=" + price + ", picture=" + Arrays.toString(picture) + ", publication_date="
				+ publication_date + ", is_available=" + is_available + ", view_number=" + view_number
				+ ", localisation=" + localisation + "]";
	}
	
	
	
	
	
	
	
	
}
