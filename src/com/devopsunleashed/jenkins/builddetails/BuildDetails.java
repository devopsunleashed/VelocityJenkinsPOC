package com.devopsunleashed.jenkins.builddetails;

public class BuildDetails {
	
    // three fields
	private String  	buildname;
	private String  	finalresult;
	private int 		compiletime;
	private int  		unittesttime;
        
	

    // one constructor
    public BuildDetails(String ifinalresult, int icompiletime, int iunittesttime, String ibuldname) {
    	setFinalresult(ifinalresult);
        setCompiletime(icompiletime);
        setUnittesttime(iunittesttime);
    }
    
    public BuildDetails() {

    }
    
    //Getters
    public String getFinalResult() {
    	return finalresult;
    }
        
    public int getUnitTestTime() {
    	return unittesttime;
    }

	public String getBuildName() {
		return buildname;
	}

	public int getCompileTime() {
		return compiletime;
	}

	
	// Setters
	public void setBuildname(String buildname) {
		this.buildname = buildname;
	}
	
	public void setCompiletime(int compiletime) {
		this.compiletime = compiletime;
	}

	public void setFinalresult(String finalresult) {
		this.finalresult = finalresult;
	}

	public void setUnittesttime(int unittesttime) {
		this.unittesttime = unittesttime;
	}
      
}
