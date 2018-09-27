package br.com.micro.services.felipe.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class UserDTO {
	
	private String email;
	private String name;
	private Long id;	
	
	
	public static void main(String[] args) {
		System.out.println(UserDTO.builder().email("sasa"));
	}
	
}
