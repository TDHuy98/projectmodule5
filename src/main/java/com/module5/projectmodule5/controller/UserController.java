package com.module5.projectmodule5.controller;

import com.module5.projectmodule5.dto.UserCreationDto;
import com.module5.projectmodule5.dto.UserModificationDto;
import com.module5.projectmodule5.dto.UserShowedDto;
import com.module5.projectmodule5.entity.User;
import com.module5.projectmodule5.repository.UserRepository;
import com.module5.projectmodule5.service.UserService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private UserService userService;
    private final UserRepository userRepository;

    public UserController(UserService userService,
                          UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }


    @GetMapping("/users")
    public List<UserShowedDto> users() {
        return userService.getAllUsers();
    }

//    @GetMapping("/users")
//    public List<User> users() {
//        return userRepository.findAll();
//    }

    @PutMapping("/users/{id}")
    public void userModificationDto(@PathVariable Long id,
                                    @RequestBody UserModificationDto userModificationDto){
        userService.updateUser(id, userModificationDto);
    }

    @PostMapping("/users")
    public UserCreationDto creationUer(@RequestBody UserCreationDto userCreationDto){
        userService.creatUser(userCreationDto);
        return userCreationDto;
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUserById(id);
    }
}
