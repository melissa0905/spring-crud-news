package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Duyuru;

public interface DuyuruJpaRepository extends JpaRepository<Duyuru,Integer> {

}
