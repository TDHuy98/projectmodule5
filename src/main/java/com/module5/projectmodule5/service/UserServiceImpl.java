package com.module5.projectmodule5.service;

import com.module5.projectmodule5.dto.UserCreationDto;
import com.module5.projectmodule5.dto.UserModificationDto;
import com.module5.projectmodule5.dto.UserShowedDto;
import com.module5.projectmodule5.entity.User;
import com.module5.projectmodule5.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private ModelMapper modelMapper;
    private UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

//public List<UserModificationDto> userDTOs=userRepository.findAll().stream().map()


    @Override
    public User findUserById(Long id) {
        return userRepository.findUserById(id);
    }

    @Override
    public List<UserShowedDto> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(this::userToUserShowedDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserCreationDto creatUser(UserCreationDto userCreationDto) {
        User user = userCreationDtoToUser(userCreationDto);
        userRepository.save(user);
        return userCreationDto;
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void updateUser(Long id, UserModificationDto userModificationDto) {
        User userGotUpdated = userModificationDtoToUser(userModificationDto);
        userRepository.save(userGotUpdated);
//        return userGotUpdated;
    }

//    @Override
//    public void updateUser1(Long id, User user) {
//        User userGotUpdated = userRepository.findUserById(id);
//        userGotUpdated.setUserName(user.getUserName());
//        userGotUpdated.setPassword(user.getPassword());
//        userGotUpdated.setEmail(user.getEmail());
//        userGotUpdated.setId(user.getId());
//        userGotUpdated.setFirstName(user.getFirstName());
//        userGotUpdated.setLastName(user.getLastName());
//        userGotUpdated.setAddress(user.getAddress());
//        userGotUpdated.setMobile(user.getMobile());
//        userGotUpdated.setAvatarUrl(user.getAvatarUrl());
//        userRepository.save(user);
//        return userGotUpdated;
//    }

    public void updateUserAvater(Long id, User user) {
        User userChangeAvater = userRepository.findUserById(id);
        userChangeAvater.setAvatarUrl(user.getAvatarUrl());
        userRepository.save(userChangeAvater);
    }


    private UserShowedDto userToUserShowedDto(User user) {
        UserShowedDto userToUserShowedDto = modelMapper.map(user, UserShowedDto.class);
        return userToUserShowedDto;
    }

    private UserModificationDto userToUserModificationDto(User user) {
        UserModificationDto userToUserModificationDto = modelMapper.map(user, UserModificationDto.class);
        return userToUserModificationDto;
    }

    private UserCreationDto userToUserCreationDto(User user) {
        UserCreationDto userToUserCreationDto = modelMapper.map(user, UserCreationDto.class);
        return userToUserCreationDto;
    }


    private User userModificationDtoToUser(UserModificationDto userModificationDto) {
        User user = modelMapper.map(userModificationDto, User.class);
        return user;
    }

    private User userCreationDtoToUser(UserCreationDto userCreationDto) {
        User user = modelMapper.map(userCreationDto, User.class);
        return user;
    }
}
