package com.company;

public class Company {
	private String companyName , companyAddress , companyRules;
	
	private Company(String companyName , String companyAddress , String companyRules) {
		this.companyAddress = companyAddress;
		this.companyName = companyName;
		this.companyRules = companyRules;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyRules() {
		return companyRules;
	}

	public void setCompanyRules(String companyRules) {
		this.companyRules = companyRules;
	}

	public String toString() {
		return "Company [companyName=" + companyName + ", companyAddress=" + companyAddress + ", companyRules="
				+ companyRules + "]";
	}

	public static Company getCompanyObject(String companyName , String companyAddress , String companyRules) {
		return new Company(companyName, companyAddress, companyRules);
	}
}
