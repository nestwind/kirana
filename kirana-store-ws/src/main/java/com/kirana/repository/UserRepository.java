package com.kirana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.kirana.model.User;

@Service
public interface UserRepository extends JpaRepository<User, String> {

}
