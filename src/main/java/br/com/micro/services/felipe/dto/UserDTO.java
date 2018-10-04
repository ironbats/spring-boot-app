package br.com.micro.services.felipe.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class UserDTO {
	
	private String email;
	private String name;
	private String id;	
	
	}
