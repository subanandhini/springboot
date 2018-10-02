package com.paypal.erc.grc.common.dal.models.issue;

import org.springframework.data.repository.CrudRepository;

public interface AuditReportDetailRepository extends CrudRepository <ReportSource, String>{
	  java.util.logging.Logger logger = java.util.logging.Logger.getLogger("AuditReportDetailRepository");
}
