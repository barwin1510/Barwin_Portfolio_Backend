package com.project.Barwin_Portfolio_Backend.repository;

import com.project.Barwin_Portfolio_Backend.model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<MyUser, Integer> {

    Optional<MyUser> findByUsername(String username);
}
