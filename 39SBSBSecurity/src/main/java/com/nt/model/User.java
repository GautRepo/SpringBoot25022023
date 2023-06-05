package com.nt.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="T10_USER")
public class User {
	@Id
	@GeneratedValue
	
	private Integer id ;
	
	private String userName;
	
	private String userEmail;
	
	private String userPassword;
	
	@ElementCollection(fetch = FetchType.EAGER)
	
	private List<String> roles;
	

}
