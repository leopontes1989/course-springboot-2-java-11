package com.pontesti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pontesti.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
