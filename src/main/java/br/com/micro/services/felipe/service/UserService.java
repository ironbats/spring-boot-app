package br.com.micro.services.felipe.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.micro.services.felipe.dto.UserDTO;
import br.com.micro.services.felipe.entity.UserEntity;
import br.com.micro.services.felipe.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserDTO getUserByEmail(String email) {
		UserEntity userEntity = userRepository.getByEmail(email);

		return UserDTO.builder().id(userEntity.getId()).email(email)
				.name(userEntity.getName()).build();
	}

	public UserDTO getUserById(String id) {
		Optional<UserEntity> userById = userRepository.findById(id);

		return UserDTO.builder().email(userById.get().getEmail()).id(id)
				.name(userById.get().getName()).build();

	}

}
