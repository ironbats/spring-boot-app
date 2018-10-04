package br.com.micro.services.felipe.entity;



import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

import javax.validation.constraints.Email;
import java.util.Date;


@Data
@Document(collection = "userEntity")
 public class UserEntity {
	
	@Id
	private String id;
	@Field(value = "name")
	private String name;
	@Field(value = "email")
	@Email
	private String email;
	@CPF
	@Field(value="cpf")
	private String cpf;
	@Field(value = "gender")
	private String genero;


}
