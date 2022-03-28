package com.ashokit.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.ashokit.service.UserService;

@WebMvcTest(value = UserRestController.class)
class UserRestControllerTest {

	@MockBean
	private UserService service;

	@Autowired
	private MockMvc mockMvc;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetUserEmail() throws Exception {
		when(service.getUserEmail(1L)).thenReturn("abc@gmail.com");
		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/user/email/1");
		int status = mockMvc.perform(builder).andReturn().getResponse().getStatus();
		assertEquals(200, status);
	}

}
