package com.example.practisewithoutsequrity.repository;

import com.example.practisewithoutsequrity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    static User findByUsername(String username) {
        return null;
    }

    @Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM User u WHERE u.name = :username")
    boolean existsByUsername(@Param("username") String username);

    Optional<User> findById(String name);

}