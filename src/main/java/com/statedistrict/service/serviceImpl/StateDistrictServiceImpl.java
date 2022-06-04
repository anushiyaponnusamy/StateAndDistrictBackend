package com.statedistrict.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.statedistrict.dto.GetDistrictByStateIdDto;
import com.statedistrict.entity.District;
import com.statedistrict.entity.State;
import com.statedistrict.repository.DistrictRepository;
import com.statedistrict.repository.StateRepository;
import com.statedistrict.service.StateDistrictService;
@Service
public class StateDistrictServiceImpl implements StateDistrictService {
  @Autowired
  StateRepository stateRepo;
  @Autowired
  DistrictRepository districtRepo;
	@Override
	public List<State> getAllStates() {
		List<State> state = new ArrayList<State>();  
		state=(List<State>) stateRepo.findAll();
		return state;  
		
	}
	@Override
		public State getStateById(int id)   
		{  
		return stateRepo.findById(id).get();  
		}
	@Override
	public List<GetDistrictByStateIdDto> getDistrictByStateId(int state_id)   
	{  
		System.out.println( districtRepo.getDistrictByStateId(state_id));
	return districtRepo.getDistrictByStateId(state_id);  
	}
	//saving a specific record by using the method save() of CrudRepository  
	public State saveOrUpdate(State states)   
	{  
		
		State state=  stateRepo.save(states);  
		return state;
	}  
	//saving a specific record by using the method save() of CrudRepository  
		public District saveOrUpdate(District district)   
		{  
			
			District districts = districtRepo.save(district);
//			district.setName(name);
//			district.setState_id(state_id);
//			districtRepo.save(district);
			
			return districts;
		}  
	

}
