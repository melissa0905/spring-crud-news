package com.example.demo.controller;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Haber;
import com.example.demo.service.HaberServices;

@Controller
public class DetailController {
	@Autowired
	private HaberServices hbservice;
	
	
	@RequestMapping(value = "/Detail/{hid}", method = RequestMethod.GET)
	public String detail(@RequestParam(required = true, name ="hid") int hid, Locale locale, Model model) {

		Haber hb=hbservice.findHaberById(hid);
		model.addAttribute("data",hb);	
		return "Detail";
	}
	
}
