package com.kspoc.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DbConfig {

	@Value("${db.username}")
	private String dbUserName;

	@Value("${db.password}")
	private String dbPassword;

	@Override
	public String toString() {
		return "DbConfig [dbUserName=" + dbUserName + ", dbPassword=" + dbPassword + "]";
	}

}
