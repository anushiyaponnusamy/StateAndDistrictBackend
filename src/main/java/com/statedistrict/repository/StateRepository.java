package com.statedistrict.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.statedistrict.dto.GetDistrictByStateIdDto;
import com.statedistrict.entity.State;
@Repository
public interface StateRepository extends CrudRepository<State, Integer>  
{

	
    
}  