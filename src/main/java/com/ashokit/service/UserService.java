package com.ashokit.service;

import com.ashokit.exception.ResourceNotFoundException;

public interface UserService {

	String getUserEmail(Long id) throws ResourceNotFoundException;

}
