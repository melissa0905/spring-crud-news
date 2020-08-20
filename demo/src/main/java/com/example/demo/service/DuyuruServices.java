package com.example.demo.service;
import java.util.List;
import com.example.demo.model.Duyuru;

public interface DuyuruServices {
	 public void addDuyuru(Duyuru duyuru);
	 public List<Duyuru> getallDuyuru();
	 public Duyuru findDuyuruById(int id);
	 public void DeleteDuyururById(int id);
	 public void UpdatedDuyuru(Duyuru duyuru);
}
