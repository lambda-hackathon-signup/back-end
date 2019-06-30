package com.lambdaschool.hackathon.repository;

import com.lambdaschool.hackathon.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>
{
    User findByUsername(String username);
}
