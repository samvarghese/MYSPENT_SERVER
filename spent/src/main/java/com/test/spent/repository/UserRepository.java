package com.test.spent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.spent.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
