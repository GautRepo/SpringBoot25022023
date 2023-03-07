package com.nt.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="T04_Supplier")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
	
	@ElementCollection
	//child table name(optional)
	//@CollectionTable(name="T04_MODESTAB")
	//element column name (optional)
	//@Column(name="mode")
	//index column name(optional)
	//@OrderColumn(name="pos")
	private List<String> modes;
	
	@ElementCollection
	//child table name(optional)
	@CollectionTable(name="formatstab")
	//element column name (optional)
	@Column(name="fmt")
	private Set<String> format;

	@ElementCollection
	//child table name(optional)
	@CollectionTable(name="datatab")
	//element column name (optional)
	@Column(name="mv")
	//index column name(optional)
	@MapKeyColumn(name="mk")
	private Map<String,String> data;
}
