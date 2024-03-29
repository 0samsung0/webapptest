package com.example.practisewithoutsequrity.repository;

import com.example.practisewithoutsequrity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    Optional<User> findById(String userName);

    Boolean existsByUsername(String userName);

}
