package com.nt.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SupRepo extends JpaRepository<Supplier, Integer> {
	
	public List<Supplier> findByAvailable(boolean flag);
	
	public List<Supplier> findBypname(String name);
	
	public List<Supplier> findByQtyGreaterThan(double qty);
	
	public List<Supplier> findByPnameContaining(String name);
	
	public List<Supplier> findByPnameContainingOrQtyLessThan(String name,double qty);
	
	public List<Supplier> findByPnameIsNull();
	
	public List<Supplier> findByPnameIsNotNull();
	
	public List<Supplier> findByQtyIn(List<Double> list);
	
	public List<Supplier> findByQtyBetween(double a, double b);

	
}
