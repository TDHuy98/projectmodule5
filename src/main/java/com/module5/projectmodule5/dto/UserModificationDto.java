package com.module5.projectmodule5.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class UserModificationDto {
    @NotNull
    private Long id;
    @NotNull
    @Length(min = 5, max = 16, message = "must have between 5 and 16 characters")
    private String userName;
    @Email
    private String email;
    @NotNull
    private String password;

    private String firstName;
    @NotNull
    private String lastName;
    @Length(min = 10, max = 10, message = "please enter 10 numbers mobile phone")
    private String mobile;

    private String address;

    private String avatarUrl;

    public UserModificationDto() {
    }

    public UserModificationDto(Long id, String userName,
                               String email, String password,
                               String firstName, String lastName,
                               String mobile, String address, String avatarUrl) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.address = address;
        this.avatarUrl = avatarUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
