package com.kspoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kspoc.entities.BenefitDetails;

@SpringBootApplication
public class IbankingKubernetesSecretsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(IbankingKubernetesSecretsApplication.class, args);
		System.err.println(context.getBean(BenefitDetails.class));
	}

}
