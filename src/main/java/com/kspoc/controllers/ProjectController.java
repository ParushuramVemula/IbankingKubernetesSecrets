package com.kspoc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kspoc.entities.BenefitDetails;

@RestController
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	private BenefitDetails benefitDetails;

	@Value("${db.username}")
	private String dbUserName;

	@Value("${db.password}")
	private String dbPassword;

	@GetMapping("/benefitDetails")
	public String getBenefitDetails() {
		return "Here are the env variables injected from applicaton.yaml file. " + benefitDetails.toString();
	}

	@GetMapping("/dbDetails")
	public String getDbDetails() {
		return "Here are the details injected from kubernetes secret : " + dbUserName + " password " + dbPassword;
	}

}
