package com.statedistrict.dto;
import com.fasterxml.jackson.annotation.JsonProperty;

public interface GetDistrictByStateIdDto {

	@JsonProperty("district_id")
	 public Integer getdistrict_id();
	@JsonProperty("name")
	 public String  getname();
	
}
