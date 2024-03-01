package com.example.empl4sem2CRUD.service;


import com.example.empl4sem2CRUD.model.User;
import com.example.empl4sem2CRUD.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;


    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    //TODO: public void deleteById(int id)
    public void deleteById(int id){
        userRepository.deleteById(id);
    }
    public void updateById(User user) {
        userRepository.updateById(user);
    }


}
