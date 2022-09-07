package com.testcampus.jpa.bookmanager.repository;

import com.testcampus.jpa.bookmanager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
