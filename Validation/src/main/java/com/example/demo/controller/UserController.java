package com.example.demo.controller;
import com.example.demo.service.UserService;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
public class UserController extends AbstractController {
    @Autowired
    UserService userService;


    @PutMapping("/validation")
    public User createUser(@Valid @RequestBody User user){

       return userService.register(user);

    }
}
