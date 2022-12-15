package com.educandonaweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandonaweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {


}