package com.ashokit.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.ashokit.exception.ResourceNotFoundException;
import com.ashokit.repo.UserRepository;

class UserServiceImplTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetUserEmail() throws ResourceNotFoundException {

		UserRepository mockRepo = Mockito.mock(UserRepository.class);
		Mockito.when(mockRepo.getUserEmailById(101L)).thenReturn(Optional.of("s.k@gmail.com"));
		UserServiceImpl userServiceImpl = new UserServiceImpl(mockRepo);
		String userEmail = userServiceImpl.getUserEmail(101L);
		assertEquals("s.k@gmail.com", userEmail);

	}

}
