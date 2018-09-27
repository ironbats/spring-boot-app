package br.com.micro.services.felipe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.micro.services.felipe.dto.UserDTO;
import br.com.micro.services.felipe.service.UserService;

@RestController
@RequestMapping(path="/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/by-email")
	public UserDTO getUser(@RequestParam(required=false) String email)
	{
		return userService.getUserByEmail(email);
	}
	
	@GetMapping("/by-id")
	public UserDTO getUserById (@RequestParam(required=false) long id)
	{
		return userService.getUserById(id);
	}
}
