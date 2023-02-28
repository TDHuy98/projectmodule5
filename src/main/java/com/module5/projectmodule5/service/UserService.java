package com.module5.projectmodule5.service;

import com.module5.projectmodule5.dto.UserCreationDto;
import com.module5.projectmodule5.dto.UserModificationDto;
import com.module5.projectmodule5.dto.UserShowedDto;
import com.module5.projectmodule5.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserService {
    User findUserById(Long id);

    List<UserShowedDto> getAllUsers();

    UserCreationDto creatUser(UserCreationDto userCreationDto);

    void deleteUserById(Long id);

    void updateUser(Long id,UserModificationDto userModificationDto);

//    void updateUser1(Long id, User user);
}
