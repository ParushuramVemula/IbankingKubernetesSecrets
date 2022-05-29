package com.kspoc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kspoc.entities.DbConfig;

@RestController
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	private DbConfig dbConfig;
	
	@GetMapping("/dbDetails")
	public String getDbDetails() {
		return dbConfig.toString();
	}

}
