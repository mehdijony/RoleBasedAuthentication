package com.example.RoleBasedAuth.dao;

import com.example.RoleBasedAuth.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
