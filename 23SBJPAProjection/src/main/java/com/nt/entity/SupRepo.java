package com.nt.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SupRepo extends JpaRepository<Supplier, Integer> {
	
	List<MyViewA> findByQtyGreaterThan(double num);
	
	List<MyViewB> findByAvailable(boolean flag);
	
	<T> List<T> findByAvailable(boolean flag, Class<T> cls);
	
	interface MyViewA{
		String getPname();
		double getQty();
	}
	
	interface MyViewB{
		 Integer getPid();
		 boolean getAvailable();
	}
	
}
