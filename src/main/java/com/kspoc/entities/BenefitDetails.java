package com.kspoc.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BenefitDetails {

	@Value("${benefit.benefitType}")
	private String benefitType;

	@Value("${benefit.sponsorProductDisplayName}")
	private String sponsorProductDisplayName;

	@Override
	public String toString() {
		return "BenefitDetails [benefitType=" + benefitType + ", sponsorProductDisplayName=" + sponsorProductDisplayName
				+ "]";
	}

}
