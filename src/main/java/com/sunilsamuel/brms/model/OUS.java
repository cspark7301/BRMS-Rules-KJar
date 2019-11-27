package com.sunilsamuel.brms.model;

public class OUS {
	private String organization;
	private String unit;
	private String subunit;
	private boolean access;

	public String getOrganization() { return this.organization; }
	public void setOrganization(String organization) { this.organization = organization; }

	public String getUnit() { return this.unit; }
	public void setUnit(String unit) { this.unit = unit; }

	public String getSubunit() { return this.subunit; }
	public void setSubunit(String subunit) { this.subunit = subunit; }

	public boolean getAccess() { return this.access; }
	public void setAccess(boolean access) { this.access = access; }

	@Override
	public String toString() {
		return "O: " + organization + ",U: " + unit + ",S: " + subunit + ", access: " + String.valueOf(access);
	}
}
