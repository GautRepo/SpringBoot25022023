package com.nt.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SupRepo extends JpaRepository<Supplier, Integer> {
	
	//@Query("SELECT pname FROM com.nt.entity.Supplier WHERE qty>:num")
	//@Query("SELECT s.pname FROM com.nt.entity.Supplier s WHERE s.qty>:num")
	@Query("SELECT s.pname FROM Supplier s WHERE s.qty>:num")
	List<String> getMyData(double num);
}
