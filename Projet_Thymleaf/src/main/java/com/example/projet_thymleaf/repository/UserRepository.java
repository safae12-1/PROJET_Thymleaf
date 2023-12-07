package com.example.projet_thymleaf.repository;

import com.example.projet_thymleaf.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}
