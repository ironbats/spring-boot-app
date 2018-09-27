package br.com.micro.services.felipe.entity;

import javax.persistence.*;

import lombok.Data;



@Entity
@Data
 public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Long id;	
	private String name;
	private String email;	
}
