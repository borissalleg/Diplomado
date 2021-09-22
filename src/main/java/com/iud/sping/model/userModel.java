package com.iud.sping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="userlogin")
public class userModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codUser;
    
	@Column(name= "nickname", nullable=false, length=150)
    private String nicName;
	@Column(name= "password", nullable=false, length=150)
    private String password;
    
    
    public userModel() {
    	
    }
    
    public userModel(int c, String n, String p) {
    	
    	this.codUser=c;
    	this.nicName=n;
    	this.password=p;
    }
    
    public void setCodUser(int cod) {
    	this.codUser=cod;
    }
    
    public int getCodUser() {
    	
    	return this.codUser;
    }
    
    
    public void setNickname(String nick) {
    	this.nicName=nick;
    }
    
    public String getNickname() {
    	
    	return this.nicName;
    }
    
    public void setPassword (String pass) {
    	this.password=pass;
    }
    
    public String getPassword() {
    	
    	return this.password;
    }
    
    
}
