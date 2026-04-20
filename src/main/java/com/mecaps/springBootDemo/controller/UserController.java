package com.mecaps.springBootDemo.controller;

import com.mecaps.springBootDemo.entity.User;
import com.mecaps.springBootDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//http://localhost:8080/users/getAllUsers
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getById/{id}")
    public User getById(@PathVariable Long id){
        User userById = userService.getUserById(id);
        return userById;
    }


    @PostMapping("/create")
    public String createUser(@RequestBody User request){
        String user = userService.createUser(request);
        return user;
    }


    @GetMapping("/getAllUsers")
    public List<User> getAll(){
        return userService.getAllUser();
    }
}
