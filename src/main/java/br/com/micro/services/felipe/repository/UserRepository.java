package br.com.micro.services.felipe.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.micro.services.felipe.entity.UserEntity;

public interface UserRepository extends MongoRepository<UserEntity, Long> {

	//To SQL JPA
	static final String FIND_USER_ENTITY_BY_EMAIL = "SELECT u FROM UserEntity  as u WHERE  u.email=:email";
	//TO MONGODB QUERY
	static final String FIND_USER_ENTITY_BY_EMAIL_MONGO = "{'email' :?0}";
	static final String EMAIL_PARAM = "email";

	Optional<UserEntity> getByEmail(String email);
	Optional<UserEntity> findById(String id);
	

}
