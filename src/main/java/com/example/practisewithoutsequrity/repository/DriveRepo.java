package com.example.practisewithoutsequrity.repository;

import com.example.practisewithoutsequrity.entity.Drive;
//import com.example.practisewithoutsequrity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DriveRepo extends JpaRepository<Drive, Integer> {

    Boolean existsByTitle(String title);
}
