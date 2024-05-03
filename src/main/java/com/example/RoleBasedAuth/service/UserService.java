package com.example.RoleBasedAuth.service;

import com.example.RoleBasedAuth.dao.RoleDao;
import com.example.RoleBasedAuth.dao.UserDao;
import com.example.RoleBasedAuth.entity.Role;
import com.example.RoleBasedAuth.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;
    public User registerNewUser(User user){
        return userDao.save(user);
    }

    public void initRolesAndUser(){
        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin Role");
        roleDao.save(adminRole);

        Role userRole = new Role();
        userRole.setRoleName("User");
        userRole.setRoleDescription("Default Role for New Records");
        roleDao.save(userRole);

        User adminUser = new User();
        adminUser.setUsername("abhinav");
        adminUser.setPassword("abhinav");
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRoles(adminRoles);
        userDao.save(adminUser);

        User user = new User();
        user.setUsername("raj");
        user.setPassword("raj");
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(userRole);
        user.setRoles(userRoles);
        userDao.save(user);
    }
}
