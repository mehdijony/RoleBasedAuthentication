package com.example.RoleBasedAuth.dao;

import com.example.RoleBasedAuth.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
