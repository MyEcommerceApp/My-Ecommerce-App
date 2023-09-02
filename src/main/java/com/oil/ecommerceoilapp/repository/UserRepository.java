package com.oil.ecommerceoilapp.repository;

import com.oil.ecommerceoilapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
