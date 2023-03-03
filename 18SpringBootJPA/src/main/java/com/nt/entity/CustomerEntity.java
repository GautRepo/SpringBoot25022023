package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Customer_JPA")
@Data
public class CustomerEntity {
	@Id
	@Column(name="customer_number")
	private int cno;
	@Column(name="customer_name")
	private String cname;
	@Column(name="customer_bill")
	private double cbill;

}
