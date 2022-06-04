package com.statedistrict.controller;
import java.util.ArrayList;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.statedistrict.dto.GetDistrictByStateIdDto;
import com.statedistrict.entity.District;
import com.statedistrict.entity.State;  
import com.statedistrict.service.StateDistrictService;
//mark class as Controller 
@CrossOrigin("*")
@RestController  
@RequestMapping("/StateDistrict")
public class StateDistrictController   {  
//autowire the StateDistrictService class  
@Autowired  
StateDistrictService stateDistrictService;  
//creating a get mapping that retrieves all the states detail from the database   
@GetMapping("/states")  
private List<State> getAllStates()   
{  
return stateDistrictService.getAllStates();  
}  
//creating a get mapping that retrieves the detail of a specific state  
//@GetMapping("/states/{id}")  
//private State getStateById(@PathVariable("id") int id)   
//{  
//return stateDistrictService.getStateById(id);  
//} 
@GetMapping("/districts/{state_id}")  
private List<GetDistrictByStateIdDto> getDistrictByStateId(@PathVariable("state_id") int state_id)   
{  
	List<GetDistrictByStateIdDto> result = new ArrayList<GetDistrictByStateIdDto>();
	try {
		result=stateDistrictService.getDistrictByStateId(state_id);
	}catch (Exception e) {
		System.out.println("StateDistrictController():::ERROR:::"+e.getMessage());
	}
return result;  
}  

//creating post mapping that post the state detail in the database  
@PostMapping("/states")  
private State saveState(@RequestBody State state)   
{  
	State s=	stateDistrictService.saveOrUpdate(state);
	return  s;  
  
}  
//creating post mapping that post the district detail in the database  
@PostMapping("/districts")  
private District saveDistricts(@RequestBody District districts)   
{  
	District D =stateDistrictService.saveOrUpdate(districts);
	return  D;  

}  
 
}  