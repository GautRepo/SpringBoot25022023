package com.nt.runner;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.SupRepo;
import com.nt.entity.Supplier;

@Component
public class SupRunner implements CommandLineRunner {
	
	@Autowired
	private SupRepo repo;
	

	@Override
	public void run(String... args) throws Exception {
		Supplier sup=new Supplier(1,"clothes",26.0,true,List.of("A","B","C"), Set.of("D","E"), Map.of("key","Value"));
		repo.save(sup);
	}

}
