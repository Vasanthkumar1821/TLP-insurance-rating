package com.tlp.insurance.model;

public class TlpInsuranceResponse {
	private String financialStability;
	private String propertyRisk;
	private String coverageLiability;
	private String pricingTier;
	
	public String getFinancialStability() {
		return financialStability;
	}
	public void setFinancialStability(String financialStability) {
		this.financialStability = financialStability;
	}
	public String getPropertyRisk() {
		return propertyRisk;
	}
	public void setPropertyRisk(String propertyRisk) {
		this.propertyRisk = propertyRisk;
	}
	public String getCoverageLiability() {
		return coverageLiability;
	}
	public void setCoverageLiability(String coverageLiability) {
		this.coverageLiability = coverageLiability;
	}
	public String getPricingTier() {
		return pricingTier;
	}
	public void setPricingTier(String pricingTier) {
		this.pricingTier = pricingTier;
	}
	@Override
	public String toString() {
		return "TlpInsuranceResponse [financialStability=" + financialStability + ", propertyRisk=" + propertyRisk
				+ ", coverageLiability=" + coverageLiability + ", pricingTier=" + pricingTier + "]";
	}
	
}
