package com.ashokit.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<String> findEmailById(Long id);

}
