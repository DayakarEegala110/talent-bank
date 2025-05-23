package com.talentbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talentbank.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
