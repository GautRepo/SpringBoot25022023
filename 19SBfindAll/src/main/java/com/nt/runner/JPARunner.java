package com.nt.runner;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.nt.entity.CustomerEntity;
import com.nt.entity.CustomerRepo;

@Component
public class JPARunner implements CommandLineRunner {
	
	@Autowired
	private CustomerRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		//find all by without sorting 
		/*List<CustomerEntity> custList= repo.findAll();
		custList.forEach(System.out::println);*/
		
		//find all by default sorting order i.e asc
		/*Sort sort= Sort.by("cbill","cno");
		List<CustomerEntity> custList=repo.findAll(sort);
		custList.forEach(System.out::println);*/
		
		//find all by custom sorting order
		/*Sort sort = Sort.by(Direction.DESC, "cbill","cno");
		List<CustomerEntity> custList=repo.findAll(sort );
		custList.forEach(System.out::println);*/
		
		//compares non-null value and fetch from db 
		/*CustomerEntity ob=new CustomerEntity(null, "Gautam", null);
		Example<CustomerEntity> ex=Example.of(ob);
		repo.findAll(ex)
		.forEach(System.out::println);*/
		
		//find all by using pagination 
		PageRequest page = PageRequest.of(0, 2);
		Page<CustomerEntity> custList=repo.findAll(page);
		custList.forEach(System.out::println);
		
		

	}

}
