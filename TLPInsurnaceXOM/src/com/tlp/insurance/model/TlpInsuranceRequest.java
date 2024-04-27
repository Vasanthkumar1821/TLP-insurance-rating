package com.tlp.insurance.model;

public class TlpInsuranceRequest {

	private int yearInBusiness;
	private int numberOfBankruptcies;
	private int yearsAtCurrentAddress;
	private String typesOfConstruction;
	private int priorLosses;
	private int ageOfProperty;
	private int PropertyValue;
	private String coverageType;
	private String industry;
	
	
	public int getYearInBusiness() {
		return yearInBusiness;
	}
	public void setYearInBusiness(int yearInBusiness) {
		this.yearInBusiness = yearInBusiness;
	}
	public int getNumberOfBankruptcies() {
		return numberOfBankruptcies;
	}
	public void setNumberOfBankruptcies(int numberOfBankruptcies) {
		this.numberOfBankruptcies = numberOfBankruptcies;
	}
	public int getYearsAtCurrentAddress() {
		return yearsAtCurrentAddress;
	}
	public void setYearsAtCurrentAddress(int yearsAtCurrentAddress) {
		this.yearsAtCurrentAddress = yearsAtCurrentAddress;
	}
	public String getTypesOfConstruction() {
		return typesOfConstruction;
	}
	public void setTypesOfConstruction(String typesOfConstruction) {
		this.typesOfConstruction = typesOfConstruction;
	}
	public int getPriorLosses() {
		return priorLosses;
	}
	public void setPriorLosses(int priorLosses) {
		this.priorLosses = priorLosses;
	}
	public int getAgeOfProperty() {
		return ageOfProperty;
	}
	public void setAgeOfProperty(int ageOfProperty) {
		this.ageOfProperty = ageOfProperty;
	}
	public int getPropertyValue() {
		return PropertyValue;
	}
	public void setPropertyValue(int propertyValue) {
		PropertyValue = propertyValue;
	}
	public String getCoverageType() {
		return coverageType;
	}
	public void setCoverageType(String coverageType) {
		this.coverageType = coverageType;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	@Override
	public String toString() {
		return "TlpInsuranceRequest [yearInBusiness=" + yearInBusiness + ", numberOfBankruptcies="
				+ numberOfBankruptcies + ", yearsAtCurrentAddress=" + yearsAtCurrentAddress + ", typesOfConstruction="
				+ typesOfConstruction + ", priorLosses=" + priorLosses + ", ageOfProperty=" + ageOfProperty
				+ ", PropertyValue=" + PropertyValue + ", coverageType=" + coverageType + ", industry=" + industry
				+ "]";
	}
	
	
}
		