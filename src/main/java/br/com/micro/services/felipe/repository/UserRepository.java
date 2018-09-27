package br.com.micro.services.felipe.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.*;
import org.springframework.data.repository.query.*;

import br.com.micro.services.felipe.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
	
	@Query(value = "SELECT u FROM UserEntity  as u WHERE  u.email=:email")
	UserEntity getByEmail(@Param("email") String email);
	
	Optional<UserEntity> findById(Long id);
	
	

}
