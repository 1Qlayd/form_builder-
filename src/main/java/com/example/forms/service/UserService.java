package com.example.forms.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.forms.model.User;
import com.example.forms.repositories.UserRepository;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
     public List<User> findAllUsers() {
        return userRepository.findAllUsers();
    }
    public Optional<User> findById(Integer id) {
        return userRepository.findById(id);
    }
    @Transactional
    public User createUser(User user){
        userRepository.create(user);
        return user; 
    }

    @Transactional
    public void updateUser(User user, Integer id) {
        userRepository.update(user, id);
    }

    @Transactional
    public void deleteUser(Integer id) {
        userRepository.delete(id);
    }
}
