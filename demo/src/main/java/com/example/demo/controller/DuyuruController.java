package com.example.demo.controller;
import com.example.demo.model.Duyuru;
import com.example.demo.service.DuyuruServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DuyuruController {
	
	@Autowired
	private DuyuruServices dyservice;
	
	@CrossOrigin
	@GetMapping("/duyuru")
	public List<Duyuru> getallDuyuru() {
		return dyservice.getallDuyuru();
	}
	 @CrossOrigin
	    @PostMapping("/addduyuru")
	    public void addDuyuru(@RequestBody Duyuru duyuru){
	        dyservice.addDuyuru(duyuru);
	    }
	  @CrossOrigin
	    @PutMapping("/updateduyuru")
	    public void UpdatedDuyuru(@RequestBody Duyuru duyuru){
	        dyservice.UpdatedDuyuru(duyuru);
	    }

	    @CrossOrigin
	    @DeleteMapping("/deleteduyuru")
	    public void DeleteDuyururById(@RequestParam(required = true, name ="id") int id){
	        dyservice.DeleteDuyururById(id);
	    }

}
