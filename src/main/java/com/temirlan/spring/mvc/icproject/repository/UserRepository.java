package com.temirlan.spring.mvc.icproject.repository;

import com.temirlan.spring.mvc.icproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
