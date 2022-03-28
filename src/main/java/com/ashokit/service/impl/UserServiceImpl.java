package com.ashokit.service.impl;

import org.springframework.stereotype.Service;

import com.ashokit.exception.ResourceNotFoundException;
import com.ashokit.repo.UserRepository;
import com.ashokit.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository repo;

	public UserServiceImpl(UserRepository repo) {
		this.repo = repo;
	}

	@Override
	public String getUserEmail(Long id) throws ResourceNotFoundException {
		return repo.getUserEmailById(id).orElseThrow(() -> new ResourceNotFoundException("404", "NOT FOUND"));
	}
}
