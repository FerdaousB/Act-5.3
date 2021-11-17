package com.thp.project.vintud.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity 
@Table(name="favoris")
public class Favoris implements Serializable{
	    @Id 
        @GeneratedValue(strategy=GenerationType.AUTO) 
        @Column(name="id_favoris")
		private int id;
	    
	    @ManyToOne  
		@JoinColumn( name="id_announce" )
		private Announcement announcement; 
	    @ManyToOne  
		@JoinColumn( name="id_user" )
		private User user ; 
	    
	    @Column(name="dateAjout")
	    @NotNull
		private String dateAjout;
		
		
		public Favoris() {
		}


		public Favoris(int id, String dateAjout) {
			this.id = id;
			this.dateAjout = dateAjout;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getDateAjout() {
			return dateAjout;
		}


		public void setDateAjout(String dateAjout) {
			this.dateAjout = dateAjout;
		}


		@Override
		public String toString() {
			return "Favoris [id=" + id  +  ", dateAjout="
					+ dateAjout + "]";
		}
		
		
		

	}

