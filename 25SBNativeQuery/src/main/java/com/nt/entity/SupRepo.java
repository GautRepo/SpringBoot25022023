package com.nt.entity;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface SupRepo extends JpaRepository<Supplier, Integer> {
	
	@Query(value = "SELECT * FROM t02_supplier WHERE PROD_STOCK=:flag",nativeQuery = true)
	List<String> getMyData(boolean flag);
	
	@Query("update Supplier set qty=:value where pid=:id")
	@Modifying
	@Transactional
	Integer updateMyData(int id, double value);
	
	@Query("delete from Supplier where pname=:name")
	@Modifying
	@Transactional
	Integer deleteMyData(String name);
}
