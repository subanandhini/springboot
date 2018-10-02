package com.paypal.erc.grc.common.dal.models.issue;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuditReportDetail {
	
  java.util.logging.Logger logger = java.util.logging.Logger.getLogger("AuditReportDetail");
		  
  @Autowired
  private AuditService as;	
@RequestMapping(path="/Report")
public List<ReportSource> Report() {
	
	return as.AuditReport();
	
}
@RequestMapping(path="/Report/{id}")
public Optional<ReportSource> Report(@PathVariable("id")String id) {
	logger.info(" Inside Report executing Report params : " + id);
    return as.AuditReport(id);
}

@RequestMapping(method=RequestMethod.POST,path="/report")
public void AuditReportPost(@RequestBody ReportSource reportSource ) {
	try {
	logger.info(" Inside AuditReportPost executing Report params : " + reportSource);
	 as.AuditReportPost(reportSource);}
	catch(Exception e) {
		logger.info(" exception has occured in AuditReport:AuditReportPost(ReportSource reportSource ) "+e.getMessage());
	}
	
}
@RequestMapping(method=RequestMethod.PUT,path="/report/{id}")
public void AuditReportPut(@PathVariable("id") String id,@RequestBody ReportSource reportSource ) {
	logger.info(" Inside AuditReportPut executing Report params : " + reportSource+" and id "+id);
	try {
	as.AuditReportPut(id,reportSource);
	}
	catch(Exception e){
		logger.info("inside AuditReportPut(id, reportSource )"+e.getMessage());
	}
}
@RequestMapping(method=RequestMethod.DELETE,path="/report/{id}")
public void AuditReportDelete(@PathVariable("id") String id, @RequestBody ReportSource reportSource ) {
	try {
	logger.info(" Inside AuditReportDelete executing Report params : " + reportSource+" and id "+id);
	 as.AuditReportDelete(id,reportSource);}
	catch(Exception e) {
		logger.info("inside AuditReportDelete(id, reportSource )"+e.getMessage());
	
	}
	
}


}
