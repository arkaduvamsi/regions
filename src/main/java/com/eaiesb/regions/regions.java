package com.eaiesb.regions;

import org.springframework.data.annotation.Id;

public class regions {
	
	@Id
	public String id;
	
	private String regionId;
	private String regionName;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRegionId() {
		return regionId;
	}
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

}
