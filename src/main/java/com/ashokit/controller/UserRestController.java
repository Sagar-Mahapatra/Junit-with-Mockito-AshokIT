package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.exception.ResourceNotFoundException;
import com.ashokit.model.UserResp;
import com.ashokit.service.UserService;

@RestController
@RequestMapping("/user")
public class UserRestController {

	@Autowired
	private UserService service;

	@GetMapping("/email/{id}")
	public UserResp getUserEmail(@PathVariable Long id) throws ResourceNotFoundException {
		String userEmail = service.getUserEmail(id);
		return new UserResp("200", userEmail);
	}

}
