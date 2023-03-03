package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="T01_Customer")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerEntity {
	@Id
	@Column(name="customer_number")
	private Integer cno;
	@Column(name="customer_name")
	private String cname;
	@Column(name="customer_bill")
	private Double cbill;

}
