package com.dev.sec.service.impl;

import com.dev.sec.model.User;
import com.dev.sec.repo.UserRepo;
import com.dev.sec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService
{

    @Autowired
    private UserRepo userRepo;

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    @Override
    public Optional<User> findByUsernameOrEmail(String username, String email) {
        return userRepo.findByUsernameOrEmail(username, email);
    }

    @Override
    public List<User> findByIdIn(List<Long> userIds) {
        return userRepo.findByIdIn(userIds);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepo.findByUsername(username);
    }

    @Override
    public Boolean existsByUsername(String username) {
        Optional<User> existingUser = findByUsername(username);

        if(existingUser.isPresent()){
            return true;
        }
        return false;
    }

    @Override
    public Boolean existsByEmail(String email) {
        Optional<User> existingUser = findByEmail(email);

        if(existingUser.isPresent()){
            return true;
        }
        return false;
    }

    @Override
    public User save(User user) {
        return userRepo.save(user);
    }
}
