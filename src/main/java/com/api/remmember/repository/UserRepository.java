package com.api.remmember.repository;

import com.api.remmember.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
        boolean existsByUsername(String username);
        boolean existsByEmail(String email);
}
