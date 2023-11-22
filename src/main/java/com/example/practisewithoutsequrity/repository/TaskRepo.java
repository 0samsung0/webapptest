package com.example.practisewithoutsequrity.repository;

import com.example.practisewithoutsequrity.entity.Task;
//import com.example.practisewithoutsequrity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepo extends JpaRepository<Task, Integer> {
}
