package com.projects.departmentservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.projects.departmentservice.validator.ValidateDepartment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

	@Id
	@GeneratedValue
	private Long departmentId;
	
	@NotNull(message = "department name should not be null")
	@Size(min = 2, max = 20)
	private String departmentName;
	
	@NotNull(message = "department address should not be null")
	@Size(min = 2, max = 20)
	private String departmentAddress;
	
	//@ValidateDepartment
	private String departmentCode;
	
	
	
}
