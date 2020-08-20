package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.demo.model.Haber;
import com.example.demo.service.HaberServices;

public class HaberController {
	@Autowired
	private HaberServices hbservice;
	
	@CrossOrigin
	@GetMapping("/haber")
	public List<Haber> getallHaber() {
		return hbservice.getallHaber();
	}
	 @CrossOrigin
	    @PostMapping("/addhaber")
	    public void addHaber(@RequestBody Haber haber){
	        hbservice.addHaber(haber);
	    }
	  @CrossOrigin
	    @PutMapping("/updatehaber")
	  public void UpdatedHaber(@RequestBody Haber haber){
	        hbservice.UpdatedHaber(haber);
	    }
	    @CrossOrigin
	    @DeleteMapping("/deletehaber")
	    public void DeleteHaberById(@RequestParam(required = true, name ="id") int id){
	        hbservice.DeleteHaberById(id);
	    }

}
