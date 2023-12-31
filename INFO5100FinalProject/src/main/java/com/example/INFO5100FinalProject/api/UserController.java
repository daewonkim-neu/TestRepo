package com.example.INFO5100FinalProject.api;

import com.example.INFO5100FinalProject.model.User;
import com.example.INFO5100FinalProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/user")
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.insertUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(path = "{id}")
    public User getUserById(@PathVariable("id") UUID id) {
        return userService.selectUserById(id)
                .orElse(null);
    }

    @PutMapping(path = "{id}")
    public int updateUserById(@PathVariable("id") UUID id, @RequestBody User user) {
        return userService.updateUserById(id, user);
    }

    @DeleteMapping(path = "{id}")
    public int deleteUserById(@PathVariable("id") UUID id) {
        return userService.deleteUserById(id);
    }
}
