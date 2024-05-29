package com.usermongodb.demoeusermongo.controller;


import com.usermongodb.demoeusermongo.entity.User;
import com.usermongodb.demoeusermongo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class MyController {
    @Autowired
    private UserRepo userRepo;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        User u1=userRepo.save(user);
        return u1;
    }


//    @GetMapping("/getUsers")
//    public List<User> getUsers(){
//        List<User> ul=userRepo.findAll();
//        reurn
//
//    }


}
