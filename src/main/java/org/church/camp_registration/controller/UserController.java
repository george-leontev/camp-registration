package org.church.camp_registration.controller;

import org.church.camp_registration.exception.ResourceNotFoundException;
import org.church.camp_registration.model.User;
import org.church.camp_registration.repository.users.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping()
    public List<User> getAll() {
        var users = userRepository.findAll();

        return users;
    }

    @GetMapping("/{id}")
    public User getUserById(@RequestParam int id) {
        var user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("The user was not found"));

        return user;
    }

    @PostMapping()
    public User createUser(@RequestBody User user) {
        var newUser = this.userRepository.save(user);

        return newUser;
    }
}
