package com.test.spent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.spent.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
