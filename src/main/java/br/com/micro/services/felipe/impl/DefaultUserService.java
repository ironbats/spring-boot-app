package br.com.micro.services.felipe.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.micro.services.felipe.dto.UserDTO;
import br.com.micro.services.felipe.entity.UserEntity;
import br.com.micro.services.felipe.repository.UserRepository;
import br.com.micro.services.service.UserService;

@Service
public class DefaultUserService implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDTO getUserByEmail(String email) {
		Optional<UserEntity> optionalUserEntity = userRepository.getByEmail(email);

		if(optionalUserEntity.isPresent())
		{
			return UserDTO.builder().id(optionalUserEntity.get().getId()).email(email)
					.name(optionalUserEntity.get().getName()).build();
		}

		return  UserDTO.builder().build();
	}

	@Override
	public UserDTO getUserById(String id) {
		Optional<UserEntity> userById = userRepository.findById(id);

		if(userById.isPresent())
		{
			return UserDTO.builder().email(userById.get().getEmail()).id(id)
					.name(userById.get().getName()).build();
		}

		return UserDTO.builder().build();

	}


	
}
