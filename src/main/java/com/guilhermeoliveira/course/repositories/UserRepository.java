package com.guilhermeoliveira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guilhermeoliveira.course.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
