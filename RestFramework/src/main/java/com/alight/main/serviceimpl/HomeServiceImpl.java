package com.alight.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alight.main.Dao.HomeDao;
import com.alight.main.model.WebServiceDemo;
import com.alight.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	HomeDao hd;
	
	@Override
	public WebServiceDemo saveService(WebServiceDemo web) {
		
		return hd.save(web);
	}

	@Override
	public WebServiceDemo getService(String name) {
		
		return hd.findByName(name);
	}

}
