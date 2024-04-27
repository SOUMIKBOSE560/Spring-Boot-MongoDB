package net.mongodbexample.controllers;

import net.mongodbexample.models.User;
import net.mongodbexample.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @Autowired
    private UserService userService;
    @PostMapping("/save")
    public boolean save(@RequestBody User user){
        return userService.save(user);
    }
}
