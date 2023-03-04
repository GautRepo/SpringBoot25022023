package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="T02_Supplier")
@Data
public class Supplier {
	@Id
	@Column(name="prod_id")
	private Integer pid;
	@Column(name="prod_name")
	private String pname;
	@Column(name="prod_quantity")
	private double qty;
	@Column(name="prod_stock")
	private boolean available;
	
}
