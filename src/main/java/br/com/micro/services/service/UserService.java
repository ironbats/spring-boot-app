package br.com.micro.services.service;

import br.com.micro.services.felipe.dto.UserDTO;

public interface UserService {

	UserDTO getUserByEmail(final String email);
	
	UserDTO getUserById(final String id);
	
}
