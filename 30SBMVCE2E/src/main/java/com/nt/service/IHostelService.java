package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nt.entity.Hostel;

public interface IHostelService {
	
	public Hostel addStd(Hostel host);
	public void updateStd(Hostel host);
	public void deleteStd(Integer id);
	
	public Optional<Hostel> getOneStd(Integer id);
	public List<Hostel> getAllStudent();
	
	public boolean isStudentExist(Integer id);
	
	public Page<Hostel> getStdsPage(Pageable p);
	

}
