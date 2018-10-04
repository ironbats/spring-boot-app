package br.com.micro.services.felipe.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.micro.services.felipe.dto.UserDTO;
import br.com.micro.services.service.UserService;

@RestController
@RequestMapping(path = "/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/by-email")
	public ResponseEntity<UserDTO> getUserByEmail(
			@RequestParam(required = false) String email) {
		UserDTO userDto = userService.getUserByEmail(email);

		if (userDto != null && StringUtils.isNotBlank(email)) {
			return new ResponseEntity<>(userDto, HttpStatus.OK);
		}

		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@GetMapping("/by-id")
	public ResponseEntity<UserDTO> getUserById(
			@RequestParam(required = false) String id) {

		UserDTO userDto = userService.getUserById(id);

		if (userDto != null && StringUtils.isNotBlank(userDto.getId())
				&& StringUtils.isNotBlank(userDto.getEmail())) {
			return new ResponseEntity<>(userDto, HttpStatus.OK);
		}

		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
}
