package com.alight.main.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alight.main.model.WebServiceDemo;

@Repository
public interface HomeDao extends JpaRepository<WebServiceDemo, Integer> {

	public WebServiceDemo findByName(String name);
	
}
