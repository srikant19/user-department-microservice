package com.projects.userservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	
	@NotNull(message = "first name should not be null")
	@Size(min = 2, max = 20, message = "first name should be between 2 and 20 in length")
	private String firstName;
	
	@NotNull(message = "last name should not be null")
	@Size(min = 2, max = 20, message = "last name should be between 2 and 20 in length")
	private String lastName;
	
	@Email
	private String email;
	
	private Long departmentId;
	
}
