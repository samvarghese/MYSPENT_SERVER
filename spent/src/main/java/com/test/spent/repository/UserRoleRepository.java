package com.test.spent.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.test.spent.model.UserRole;

public interface UserRoleRepository  extends JpaRepository<UserRole, Long> {

}
