package com.statedistrict.service;

import java.util.List;

import com.statedistrict.dto.GetDistrictByStateIdDto;
import com.statedistrict.entity.District;
import com.statedistrict.entity.State;

public interface StateDistrictService {

	List<State> getAllStates();

	State getStateById(int id);
	
	List<GetDistrictByStateIdDto> getDistrictByStateId(int state_id);

	
	State saveOrUpdate(State state);

	District saveOrUpdate(District district);

}
