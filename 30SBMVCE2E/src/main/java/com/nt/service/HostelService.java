package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nt.entity.Hostel;
import com.nt.entity.IHostelRepo;

@Service
public class HostelService implements IHostelService{
	
	@Autowired
	private IHostelRepo repo;

	@Override
	public Hostel addStd(Hostel host) {
		
		return repo.save(host);
	}

	@Override
	public void updateStd(Hostel host) {
		
		repo.save(host);
	}

	@Override
	public void deleteStd(Integer id) {
		repo.deleteById(id);
		
	}

	@Override
	public Optional<Hostel> getOneStd(Integer id) {
		
		return repo.findById(id);
	}

	@Override
	public List<Hostel> getAllStudent() {
		
		return repo.findAll();
	}

	@Override
	public boolean isStudentExist(Integer id) {
		return repo.existsById(id);
	}

	@Override
	public Page<Hostel> getStdsPage(Pageable p) {
		
		return repo.findAll(p);
	}

}
