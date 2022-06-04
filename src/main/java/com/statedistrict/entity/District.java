package com.statedistrict.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "District")
public class District {
//districtId, name, stateId
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="district_id")
	private Integer district_id;
	
	@Column(name="state_id")
	private Integer state_id;
	
	@Column(name="name")
	private String name;
	
}
