package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.example.demo.model.Haber;
import com.example.demo.repository.HaberJpaRepository;
@Service
@Transactional

public class HaberServiceImp implements HaberServices{

	@Autowired
	private HaberJpaRepository hbrepo;
	@Override
	public void addHaber(Haber haber) {
		
		this.hbrepo.save(haber);
	}

	@Override
	public List<Haber> getallHaber() {
		return this.hbrepo.findAll();
	}

	@Override
	public Haber findHaberById(int id) {
		// TODO Auto-generated method stub
		return hbrepo.findById(id).get();
	}

	@Override
	public void DeleteHaberById(int id) {
		this.hbrepo.deleteById(id);
		
	}

	@Override
	public void UpdatedHaber(Haber haber) {
		
		this.hbrepo.save(haber);
		
	}
	
}
