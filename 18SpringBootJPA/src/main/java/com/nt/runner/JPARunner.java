package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.CustomerEntity;
import com.nt.entity.CustomerRepo;

@Component
public class JPARunner implements CommandLineRunner {
	
	@Autowired
	private CustomerRepo repo;

	@Override
	public void run(String... args) throws Exception {
		CustomerEntity cust= new CustomerEntity();
		cust.setCno(1);
		cust.setCname("Gautam");
		cust.setCbill(10);
		repo.save(cust);
		
	}

}
