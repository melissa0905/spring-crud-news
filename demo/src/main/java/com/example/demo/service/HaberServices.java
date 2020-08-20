package com.example.demo.service;
import java.util.List;
import com.example.demo.model.Haber;


public interface HaberServices {
	 public void addHaber(Haber haber);
	 public List<Haber> getallHaber();
	 public Haber findHaberById(int id);
	 public void DeleteHaberById(int id);
	 public void UpdatedHaber(Haber haber);
}
