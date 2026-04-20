package com.mecaps.springBootDemo.service;


import com.mecaps.springBootDemo.entity.User;
import com.mecaps.springBootDemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User getUserById(Long id){
       User user = userRepository.findById(id)
               .orElseThrow( () -> new RuntimeException("User id not found : " + id));

       return user;
    }



    public List<User> getAllUser(){
        List<User> all = userRepository.findAll();
        return all;
    }


    public String createUser(User request){

        User user = new User();

        user.setUserName(request.getUserName());
        user.setAge(request.getAge());
        user.setAddress(request.getAddress());

        userRepository.save(user);

        return "User Created Successfully!";
    }
}
