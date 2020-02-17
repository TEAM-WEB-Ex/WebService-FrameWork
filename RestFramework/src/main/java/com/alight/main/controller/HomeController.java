package com.alight.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.alight.main.model.WebServiceDemo;
import com.alight.main.service.HomeService;

@Controller
public class HomeController {

	@Autowired
	HomeService hs;
	
	@Autowired
	RestTemplate rtemplate;

	@RequestMapping("/")
	public String m1() {

		return "indexpage";
	}

	@RequestMapping("/save1")
	public String saveService(@ModelAttribute WebServiceDemo web, Model m) {
		System.out.println("hii");
		
		WebServiceDemo w=hs.saveService(web);
	
		
		String s="record updated";
		m.addAttribute("s", s);
		return "success";
		
	}

	@RequestMapping("/test1")
	public String getService(@RequestParam("name")String name,Model m) {
		System.out.println("hello");
		WebServiceDemo w=hs.getService(name);
		
		/* List l=rtemplate.getForObject(w.getUrl(),List.class); */
		
		List l=new ArrayList<>();
			 l.add(w);
		
		m.addAttribute("list", l);
		return "success";
	}

}
