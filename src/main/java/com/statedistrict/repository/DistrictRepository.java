package com.statedistrict.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.statedistrict.dto.GetDistrictByStateIdDto;
import com.statedistrict.entity.District;

public interface DistrictRepository  extends CrudRepository<District, Integer>  {
	@Query(value="Select district_id ,name from  district  where state_id=?1",nativeQuery = true)
	List<GetDistrictByStateIdDto> getDistrictByStateId(int state_id);  
}
