package com.thp.project.vintud.entity;

import java.io.Serializable;
import java.util.List;

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
@Table(name="`user`")
public class User implements Serializable {
        
	    @Id 
        @GeneratedValue(strategy=GenerationType.AUTO) 
        @Column(name="id_user")
		private int id ;
	    
	    @Column(name="firstname")
	    @NotNull
		private String firstname ;
	    
	    @Column(name="name")
	    @NotNull
		private String name ;
	    
	    @Column(name="pseudo")
	    @NotNull
		private String pseudo  ;
	    
	    @Column(name="mail")
	    @NotNull
		private String mail ;
	    
	    @Column(name="u_password")
	    @NotNull
		private String u_password  ;
	    
	    @Column(name="phone")
	    @NotNull
		private String phone ;
	    
	    @Column(name="address")
	    @NotNull
		private String address  ;
	    
	    @ManyToOne  
		@JoinColumn( name="id_role" )
		private Role role ;
		
	    
		
		
		
		
		public User() {
		}





		public User(int id, String firstname, String name, String pseudo, String mail, String u_password, String phone,
				String address) {
			this.id = id;
			this.firstname = firstname;
			this.name = name;
			this.pseudo = pseudo;
			this.mail = mail;
			this.u_password = u_password;
			this.phone = phone;
			this.address = address;
		
		}





		public int getId() {
			return id;
		}





		public void setId(int id) {
			this.id = id;
		}





		public String getFirstname() {
			return firstname;
		}





		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}





		public String getName() {
			return name;
		}





		public void setName(String name) {
			this.name = name;
		}





		public String getPseudo() {
			return pseudo;
		}





		public void setPseudo(String pseudo) {
			this.pseudo = pseudo;
		}





		public String getMail() {
			return mail;
		}





		public void setMail(String mail) {
			this.mail = mail;
		}





		public String getU_password() {
			return u_password;
		}





		public void setU_password(String u_password) {
			this.u_password = u_password;
		}





		public String getPhone() {
			return phone;
		}





		public void setPhone(String phone) {
			this.phone = phone;
		}





		public String getAddress() {
			return address;
		}





		public void setAddress(String address) {
			this.address = address;
		}




		@Override
		public String toString() {
			return "User [id=" + id + ", firstname=" + firstname + ", name=" + name + ", pseudo=" + pseudo + ", mail="
					+ mail + ", u_password=" + u_password + ", phone=" + phone + ", address=" + address + "]";
		}
		
		
		
		
}
