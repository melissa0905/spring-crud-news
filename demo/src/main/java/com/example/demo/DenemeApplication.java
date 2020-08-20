package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.HaberJpaRepository;
import com.example.demo.repository.DuyuruJpaRepository;



@SpringBootApplication
public class DenemeApplication {
	@Autowired
	HaberJpaRepository haberRepo;
	@Autowired
	DuyuruJpaRepository duyuruRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(DenemeApplication.class, args);
	}
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		haberRepo.deleteAll();
		duyuruRepo.deleteAll();
	}
}
