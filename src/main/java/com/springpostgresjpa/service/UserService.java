package com.springpostgresjpa.service;
import com.springpostgresjpa.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long userId);
    User createUser(User user);
    User updateUser(Long userId, User user);
    void deleteUser(Long userId);
}
