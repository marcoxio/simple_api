package com.example.springboot.simpleapi.repository;

import com.example.springboot.simpleapi.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByRole(String role);
}
