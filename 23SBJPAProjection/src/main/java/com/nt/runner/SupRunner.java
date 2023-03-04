package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.SupRepo;
import com.nt.entity.SupRepo.MyViewA;

@Component
public class SupRunner implements CommandLineRunner {
	
	@Autowired
	private SupRepo repo;
	

	@Override
	public void run(String... args) throws Exception {
		
		/*repo.findByQtyGreaterThan(30).forEach(o -> System.out.println(o.getPname() +"-"
				+o.getQty()));*/
		
		/*repo.findByAvailable(true).forEach(o -> System.out.println(o.getPid()+"-"
				+o.getAvailable()));*/
		
		repo.findByAvailable(false, MyViewA.class).forEach(o->
							System.out.println(o.getPname()+"-"+o.getQty()));
	}

}
