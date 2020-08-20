package com.example.demo.service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.DuyuruJpaRepository;
import com.example.demo.model.Duyuru;

@Service
@Transactional
public class DuyuruServiceImp implements DuyuruServices{

    @Autowired
    private DuyuruJpaRepository duyururepo;
	@Override
	public void addDuyuru(Duyuru duyuru) {
		this.duyururepo.save(duyuru);
	}

	@Override
	public List<Duyuru> getallDuyuru() {
		// TODO Auto-generated method stub
		return this.duyururepo.findAll();
	}

	@Override
	public Duyuru findDuyuruById(int id) {
		// TODO Auto-generated method stub
		return duyururepo.findById(id).get();
	}

	@Override
	public void DeleteDuyururById(int id) {
		this.duyururepo.deleteById(id);
	}

	@Override
	public void UpdatedDuyuru(Duyuru duyuru) {
	
		this.duyururepo.save(duyuru);
		
	}
	
}
