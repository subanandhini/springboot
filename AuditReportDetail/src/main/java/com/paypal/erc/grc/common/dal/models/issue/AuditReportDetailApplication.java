package com.paypal.erc.grc.common.dal.models.issue;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@SpringBootApplication
public class AuditReportDetailApplication {
	  java.util.logging.Logger logger = java.util.logging.Logger.getLogger("AuditReportDetail");

	public static void main(String[] args) {
		SpringApplication.run(AuditReportDetailApplication.class, args);
	}
}
