package com.example.demo.controller;

import java.util.List;
import java.util.Locale;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Haber;
import com.example.demo.service.HaberServices;
import com.example.demo.model.Duyuru;
import com.example.demo.service.DuyuruServices;


@Controller
public class HomeController {
	@Autowired
	private HaberServices hbservice;
	@Autowired
	private DuyuruServices dyservice;
	
	
	
	@GetMapping("/")
	public ModelAndView getHome() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		mav.addObject("message", "this is an index jsp file called index.jsp");
		return mav;
	}

	@RequestMapping(value = "edit/duyuruEdit", method = RequestMethod.POST)
	public String DuyuruEdit(@RequestParam(required = true, name ="dyid") int dyid, Locale locale, Model model) {

		Duyuru dy=dyservice.findDuyuruById(dyid);
		dyservice.addDuyuru(dy);
		return "duyuru";
	}

	@RequestMapping(value = "edit/haberEdit", method = RequestMethod.POST)
	public String HaberEdit(@RequestParam(required = true, name ="hid") int hid, Locale locale, Model model) {

		Haber hb=hbservice.findHaberById(hid);
		hbservice.addHaber(hb);
		return "haber";
	}

		



}