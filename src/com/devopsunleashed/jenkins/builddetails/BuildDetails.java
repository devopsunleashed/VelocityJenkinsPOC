package com.devopsunleashed.jenkins.builddetails;

public class BuildDetails {
	
    // three fields
	private String  	buildName;
	private String  	buildResult;
	private int 		buildTime;
        
    // Constructor
    public BuildDetails(String buildResult, int buildTime, String buildName) {
    	this.buildName = buildName;
        this.buildTime = buildTime;
        this.buildResult = buildResult;
    }
    
 // Constructor
    public BuildDetails() {

    }
    
    //Getters
    public String getBuildResult() {
    	return buildResult;
    }
        

	public String getBuildName() {
		return buildName;
	}

	public int getBuildTime() {
		return buildTime;
	}

	
	// Setters
	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}
	
	public void setBuildTime(int buildTime) {
		this.buildTime = buildTime;
	}

	public void setBuildResult(String buildResult) {
		this.buildResult = buildResult;
	}
      
}
