package com.devopsunleashed.jenkins.reports;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import com.devopsunleashed.jenkins.builddetails.BuildDetails;

public class ReportGenerator {

	public static void main(String[] args) {
		 
		BuildDetails myBuildDetails1 = new BuildDetails();
		BuildDetails myBuildDetails2 = new BuildDetails();		
		BuildDetails myBuildDetails3 = new BuildDetails();
		
		myBuildDetails1.setBuildname("Build 1");
		myBuildDetails1.setCompiletime(12);
		myBuildDetails1.setFinalresult("Success");
		myBuildDetails1.setUnittesttime(22);
		
		myBuildDetails2.setBuildname("Build 2");
		myBuildDetails2.setCompiletime(12);
		myBuildDetails2.setFinalresult("Success");
		myBuildDetails2.setUnittesttime(22);
		
		myBuildDetails3.setBuildname("Build 3");
		myBuildDetails3.setCompiletime(12);
		myBuildDetails3.setFinalresult("Success");
		myBuildDetails3.setUnittesttime(22);
		
		
		VelocityEngine ve = new VelocityEngine();
		 ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		 ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		 
		 ve.init();
		 
		 
		 VelocityContext ctx = new VelocityContext();
		 
		 ctx.put("name", "velocity");
		 ctx.put("date", (new Date()).toString());
		 
		 List temp = new ArrayList();
		 temp.add(myBuildDetails1);
		 temp.add(myBuildDetails2);
		 temp.add(myBuildDetails3);
		 ctx.put("list", temp);
		 
		 StringWriter sw = new StringWriter();
		 
		 Template t = ve.getTemplate("ForLoopTemplate.vm");
		 t.merge(ctx, sw);
		 
		 System.out.println(sw.toString());
		
	}

}
