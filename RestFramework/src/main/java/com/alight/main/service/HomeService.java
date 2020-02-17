package com.alight.main.service;

import com.alight.main.model.WebServiceDemo;

public interface HomeService {

	public WebServiceDemo saveService(WebServiceDemo web);

	public WebServiceDemo getService(String name);
}
