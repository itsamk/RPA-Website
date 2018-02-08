package com.cg.rpa.model;

import java.util.Date;

public class RPADashboardDealMasterBean {

	private String serialNumber;
	private String businessUnit;
	private String account;
	private String regions;
	private String rpaCoeBsvInvolved;
	private String rpaTeamContact;
	private String buAccountConnect;
	private String salesStages;
	private String opportunityCategory;
	private String keyOpportunity;
	private String opportunityDescription;
	private String currentStatusOfDeal;
	private String value;
	private String dealSize;
	private String probability;
	private String scope;
	private String technology;
	private Date opportunityStartDate;
	private Date expectedOpportunityClosureDate;
	private String expectedClosureQuarterYear;
	private Date projectedStartDate;
	private String deliveryLocation;
	private String resourceCountDemand;
	private String billRate;
	private Date projectedEndDate;
	private String comments;
	private String thorId;
	
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getRegions() {
		return regions;
	}
	public void setRegions(String regions) {
		this.regions = regions;
	}
	public String getRpaCoeBsvInvolved() {
		return rpaCoeBsvInvolved;
	}
	public void setRpaCoeBsvInvolved(String rpaCoeBsvInvolved) {
		this.rpaCoeBsvInvolved = rpaCoeBsvInvolved;
	}
	public String getRpaTeamContact() {
		return rpaTeamContact;
	}
	public void setRpaTeamContact(String rpaTeamContact) {
		this.rpaTeamContact = rpaTeamContact;
	}
	public String getBuAccountConnect() {
		return buAccountConnect;
	}
	public void setBuAccountConnect(String buAccountConnect) {
		this.buAccountConnect = buAccountConnect;
	}
	public String getSalesStages() {
		return salesStages;
	}
	public void setSalesStages(String salesStages) {
		this.salesStages = salesStages;
	}
	public String getOpportunityCategory() {
		return opportunityCategory;
	}
	public void setOpportunityCategory(String opportunityCategory) {
		this.opportunityCategory = opportunityCategory;
	}
	public String getKeyOpportunity() {
		return keyOpportunity;
	}
	public void setKeyOpportunity(String keyOpportunity) {
		this.keyOpportunity = keyOpportunity;
	}
	public String getOpportunityDescription() {
		return opportunityDescription;
	}
	public void setOpportunityDescription(String opportunityDescription) {
		this.opportunityDescription = opportunityDescription;
	}
	public String getCurrentStatusOfDeal() {
		return currentStatusOfDeal;
	}
	public void setCurrentStatusOfDeal(String currentStatusOfDeal) {
		this.currentStatusOfDeal = currentStatusOfDeal;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDealSize() {
		return dealSize;
	}
	public void setDealSize(String dealSize) {
		this.dealSize = dealSize;
	}
	public String getProbability() {
		return probability;
	}
	public void setProbability(String probability) {
		this.probability = probability;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public Date getOpportunityStartDate() {
		return opportunityStartDate;
	}
	public void setOpportunityStartDate(Date opportunityStartDate) {
		this.opportunityStartDate = opportunityStartDate;
	}
	public Date getExpectedOpportunityClosureDate() {
		return expectedOpportunityClosureDate;
	}
	public void setExpectedOpportunityClosureDate(Date expectedOpportunityClosureDate) {
		this.expectedOpportunityClosureDate = expectedOpportunityClosureDate;
	}
	public String getExpectedClosureQuarterYear() {
		return expectedClosureQuarterYear;
	}
	public void setExpectedClosureQuarterYear(String expectedClosureQuarterYear) {
		this.expectedClosureQuarterYear = expectedClosureQuarterYear;
	}
	public Date getProjectedStartDate() {
		return projectedStartDate;
	}
	public void setProjectedStartDate(Date projectedStartDate) {
		this.projectedStartDate = projectedStartDate;
	}
	public String getDeliveryLocation() {
		return deliveryLocation;
	}
	public void setDeliveryLocation(String deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
	}
	public String getResourceCountDemand() {
		return resourceCountDemand;
	}
	public void setResourceCountDemand(String resourceCountDemand) {
		this.resourceCountDemand = resourceCountDemand;
	}
	public String getBillRate() {
		return billRate;
	}
	public void setBillRate(String billRate) {
		this.billRate = billRate;
	}
	public Date getProjectedEndDate() {
		return projectedEndDate;
	}
	public void setProjectedEndDate(Date projectedEndDate) {
		this.projectedEndDate = projectedEndDate;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getThorId() {
		return thorId;
	}
	public void setThorId(String thorId) {
		this.thorId = thorId;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		result = prime * result + ((billRate == null) ? 0 : billRate.hashCode());
		result = prime * result + ((buAccountConnect == null) ? 0 : buAccountConnect.hashCode());
		result = prime * result + ((businessUnit == null) ? 0 : businessUnit.hashCode());
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((currentStatusOfDeal == null) ? 0 : currentStatusOfDeal.hashCode());
		result = prime * result + ((dealSize == null) ? 0 : dealSize.hashCode());
		result = prime * result + ((deliveryLocation == null) ? 0 : deliveryLocation.hashCode());
		result = prime * result + ((expectedClosureQuarterYear == null) ? 0 : expectedClosureQuarterYear.hashCode());
		result = prime * result
				+ ((expectedOpportunityClosureDate == null) ? 0 : expectedOpportunityClosureDate.hashCode());
		result = prime * result + ((keyOpportunity == null) ? 0 : keyOpportunity.hashCode());
		result = prime * result + ((opportunityCategory == null) ? 0 : opportunityCategory.hashCode());
		result = prime * result + ((opportunityDescription == null) ? 0 : opportunityDescription.hashCode());
		result = prime * result + ((opportunityStartDate == null) ? 0 : opportunityStartDate.hashCode());
		result = prime * result + ((probability == null) ? 0 : probability.hashCode());
		result = prime * result + ((projectedEndDate == null) ? 0 : projectedEndDate.hashCode());
		result = prime * result + ((projectedStartDate == null) ? 0 : projectedStartDate.hashCode());
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
		result = prime * result + ((resourceCountDemand == null) ? 0 : resourceCountDemand.hashCode());
		result = prime * result + ((rpaCoeBsvInvolved == null) ? 0 : rpaCoeBsvInvolved.hashCode());
		result = prime * result + ((rpaTeamContact == null) ? 0 : rpaTeamContact.hashCode());
		result = prime * result + ((salesStages == null) ? 0 : salesStages.hashCode());
		result = prime * result + ((scope == null) ? 0 : scope.hashCode());
		result = prime * result + ((serialNumber == null) ? 0 : serialNumber.hashCode());
		result = prime * result + ((technology == null) ? 0 : technology.hashCode());
		result = prime * result + ((thorId == null) ? 0 : thorId.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RPADashboardDealMasterBean other = (RPADashboardDealMasterBean) obj;
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		if (billRate == null) {
			if (other.billRate != null)
				return false;
		} else if (!billRate.equals(other.billRate))
			return false;
		if (buAccountConnect == null) {
			if (other.buAccountConnect != null)
				return false;
		} else if (!buAccountConnect.equals(other.buAccountConnect))
			return false;
		if (businessUnit == null) {
			if (other.businessUnit != null)
				return false;
		} else if (!businessUnit.equals(other.businessUnit))
			return false;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (currentStatusOfDeal == null) {
			if (other.currentStatusOfDeal != null)
				return false;
		} else if (!currentStatusOfDeal.equals(other.currentStatusOfDeal))
			return false;
		if (dealSize == null) {
			if (other.dealSize != null)
				return false;
		} else if (!dealSize.equals(other.dealSize))
			return false;
		if (deliveryLocation == null) {
			if (other.deliveryLocation != null)
				return false;
		} else if (!deliveryLocation.equals(other.deliveryLocation))
			return false;
		if (expectedClosureQuarterYear == null) {
			if (other.expectedClosureQuarterYear != null)
				return false;
		} else if (!expectedClosureQuarterYear.equals(other.expectedClosureQuarterYear))
			return false;
		if (expectedOpportunityClosureDate == null) {
			if (other.expectedOpportunityClosureDate != null)
				return false;
		} else if (!expectedOpportunityClosureDate.equals(other.expectedOpportunityClosureDate))
			return false;
		if (keyOpportunity == null) {
			if (other.keyOpportunity != null)
				return false;
		} else if (!keyOpportunity.equals(other.keyOpportunity))
			return false;
		if (opportunityCategory == null) {
			if (other.opportunityCategory != null)
				return false;
		} else if (!opportunityCategory.equals(other.opportunityCategory))
			return false;
		if (opportunityDescription == null) {
			if (other.opportunityDescription != null)
				return false;
		} else if (!opportunityDescription.equals(other.opportunityDescription))
			return false;
		if (opportunityStartDate == null) {
			if (other.opportunityStartDate != null)
				return false;
		} else if (!opportunityStartDate.equals(other.opportunityStartDate))
			return false;
		if (probability == null) {
			if (other.probability != null)
				return false;
		} else if (!probability.equals(other.probability))
			return false;
		if (projectedEndDate == null) {
			if (other.projectedEndDate != null)
				return false;
		} else if (!projectedEndDate.equals(other.projectedEndDate))
			return false;
		if (projectedStartDate == null) {
			if (other.projectedStartDate != null)
				return false;
		} else if (!projectedStartDate.equals(other.projectedStartDate))
			return false;
		if (regions == null) {
			if (other.regions != null)
				return false;
		} else if (!regions.equals(other.regions))
			return false;
		if (resourceCountDemand == null) {
			if (other.resourceCountDemand != null)
				return false;
		} else if (!resourceCountDemand.equals(other.resourceCountDemand))
			return false;
		if (rpaCoeBsvInvolved == null) {
			if (other.rpaCoeBsvInvolved != null)
				return false;
		} else if (!rpaCoeBsvInvolved.equals(other.rpaCoeBsvInvolved))
			return false;
		if (rpaTeamContact == null) {
			if (other.rpaTeamContact != null)
				return false;
		} else if (!rpaTeamContact.equals(other.rpaTeamContact))
			return false;
		if (salesStages == null) {
			if (other.salesStages != null)
				return false;
		} else if (!salesStages.equals(other.salesStages))
			return false;
		if (scope == null) {
			if (other.scope != null)
				return false;
		} else if (!scope.equals(other.scope))
			return false;
		if (serialNumber == null) {
			if (other.serialNumber != null)
				return false;
		} else if (!serialNumber.equals(other.serialNumber))
			return false;
		if (technology == null) {
			if (other.technology != null)
				return false;
		} else if (!technology.equals(other.technology))
			return false;
		if (thorId == null) {
			if (other.thorId != null)
				return false;
		} else if (!thorId.equals(other.thorId))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	

}
