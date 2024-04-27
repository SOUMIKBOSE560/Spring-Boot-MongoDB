package net.mongodbexample.services;

import net.mongodbexample.models.User;
import net.mongodbexample.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public boolean save(User user){
        userRepository.save(user);
        return true;
    }
}
