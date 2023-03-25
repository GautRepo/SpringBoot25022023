package com.nt.entity;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Hostel {
	
	@Id
	@GeneratedValue
	private Integer hid;
	private String hname;
	private String gender;
	private String pwd;
	private String course;
	private String addr;
	@ElementCollection
	private List<String> lang;

}
