package br.com.micro.services.felipe.entity;



import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;




@Data
@Document(collection = "userEntity")
 public class UserEntity {
	
	@Id
	private String id;
	@Field(value = "name")
	private String name;
	@Field(value = "email")
	private String email;	
}
