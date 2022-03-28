package com.ashokit.service.impl;

import org.springframework.stereotype.Service;

import com.ashokit.repo.UserRepository;
import com.ashokit.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository repo;

	public UserServiceImpl(UserRepository repo) {
		this.repo = repo;
	}

	@Override
	public String getUserEmail(Long id) {
		return repo.findEmailById(id).orElseThrow(() -> new RuntimeException("USER WITH ID " + id + " NOT FOUND"));
	}

}
