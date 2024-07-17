package com.example.utils;
import java.io.*;

import java.util.*;

import org.apache.commons.io.FileUtils;

import com.google.common.io.Files;

import io.woo.htmltopdf.HtmlToPdf;
import io.woo.htmltopdf.HtmlToPdfObject;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;


public class PDFReportParallelExecution{

	public static String path = "target\\ConsolidatedHTMLReport\\cucumber-html-reports\\";
	
		
	public static void main(String args[]) throws Exception{
		
		consolidatedAllJsonGenerateHTMLReport();
		generatePassFailPDFReports();
		
	}
	
	public static void consolidatedAllJsonGenerateHTMLReport() {
		
		File reportOutputDirectory = new File("target/ConsolidatedHTMLReport");
		
		List<String> jsonFile = new ArrayList<>();
		
		File file = new File(System.getProperty("user.dir")+"\\target");
		String[] fileList = file.list();
		jsonFile.add(System.getProperty("user.dir")+"\\target\\cucumber.json");
		jsonFile.add(System.getProperty("user.dir")+"\\target1\\cucumber.json");
		
		
		String buildnumber = "1";
		String projectName = "CucumberProject";
		boolean runWithJenkins = false;
		boolean parallelTesting = true;
		
		Configuration configuration = new Configuration(reportOutputDirectory,projectName);
		configuration.setRunWithJenkins(runWithJenkins);
		configuration.setParallelTesting(true);
		configuration.setBuildNumber(buildnumber);
		
		configuration.addClassifications("Platform","Windows");
		configuration.addClassifications("Browser","Firefox");
		configuration.addClassifications("Branch","release/1.0");
		
		ReportBuilder reportBuilder = new ReportBuilder(jsonFile, configuration);
		Reportable result = reportBuilder.generateReports();
		System.out.println("Finished");
		

	}
	
	public static void generatePassFailPDFReports() {
		
		Iterator it = FileUtils.iterateFiles(new File(path), null, false);
		HtmlToPdf h = HtmlToPdf.create();
		List<HtmlToPdfObject> objs = Collections.synchronizedList(new ArrayList<HtmlToPdfObject>());
		objs.add(HtmlToPdfObject.forUrl(path+"overview-features.html"));
		while(it.hasNext()) {
			File f = (File)it.next();
			if(Files.getFileExtension(f.getAbsolutePath()).equalsIgnoreCase("html") &&
					f.getName().startsWith("report-feature")) {
				System.out.println(f.getAbsolutePath());
				objs.add(HtmlToPdfObject.forUrl(f.getAbsolutePath()));			
			}
			
		}
		objs.add(HtmlToPdfObject.forUrl(path+"overview-failures.html"));
		for(HtmlToPdfObject htmlToPdfObject: objs) {
			h.object(htmlToPdfObject);
		}
		
		boolean success = h.convert("target//"+"sample_details_report.pdf");
		
		System.out.println(success?"PDF Success report generated":"PDF failure report generated");
		
		
	}
	
	
}