package com.ryan.netSocial.services.impl;

import com.ryan.netSocial.models.User;
import com.ryan.netSocial.repositories.UserRepository;
import com.ryan.netSocial.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(final User user){
        User existingUser = userRepository.findByUsername(user.getName());
        if(Objects.nonNull(existingUser)){
            throw new RuntimeException("Existing User");
        }
        User entity = new User(user.getUserId(), user.getName(), user.getEmail(), user.getPassword(), user.getRole());
        User newUser = userRepository.save(entity);
        return  new User(newUser.getUserId(), newUser.getName(), newUser.getEmail(), newUser.getPassword(), newUser.getRole());
    }
}
