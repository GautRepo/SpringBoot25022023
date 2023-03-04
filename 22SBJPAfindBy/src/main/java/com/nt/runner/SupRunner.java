package com.nt.runner;

import java.util.List;

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
		/*List<Supplier> list=repo.findByAvailable(false);
		list.forEach(System.out::println);*/
		
		/*List<Supplier> list = repo.findBypname("Pen");
		list.forEach(System.out::println);*/
		
		//repo.findByQtyGreaterThan(10).forEach(System.out::println);
		
		//repo.findByPnameContaining("Head").forEach(System.out::println);
		
		//repo.findByPnameContainingOrQtyLessThan("Head", 30).forEach(System.out::println);
		
		//repo.findByPnameIsNull().forEach(System.out::println);
		
		//repo.findByPnameIsNotNull().forEach(System.out::println);
		
		/*List<Double> listQty = List.of(10.0,14.0,54.0);
		
		repo.findByQtyIn(listQty).forEach(System.out::println);*/
		
		//repo.findByQtyBetween(2, 30).forEach(System.out::println);

	}

}
