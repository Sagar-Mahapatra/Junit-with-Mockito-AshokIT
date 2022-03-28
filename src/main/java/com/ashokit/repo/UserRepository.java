package com.ashokit.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ashokit.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query("SELECT userEmail from User WHERE id=:id")
	Optional<String> getUserEmailById(Long id);

}
