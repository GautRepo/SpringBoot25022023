package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.SupRepo;

@Component
public class SupRunner implements CommandLineRunner {
	
	@Autowired
	private SupRepo repo;
	

	@Override
	public void run(String... args) throws Exception {
		repo.getMyData(true).forEach(System.out::println);
		
		/*int count=repo.updateMyData(4, 16);
		System.out.println(count);*/
		
		/*int count = repo.deleteMyData("Tablet");
		System.out.println(count);*/
	}

}
