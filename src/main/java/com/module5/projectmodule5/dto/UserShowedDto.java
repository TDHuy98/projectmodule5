package com.module5.projectmodule5.dto;

import com.module5.projectmodule5.entity.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
 * A DTO for the {@link User} entity
 */
@Data
public class UserShowedDto implements Serializable {
    @NotNull
    @Length(min = 5, max = 16, message = "must have between 5 and 16 characters")
    private  String userName;
    @Email
    private  String email;
    private  String firstName;
    @NotNull
    private  String lastName;
    @Length(min = 10, max = 10, message = "please enter 10 numbers mobile phone")
    private  String mobile;
    private  String address;
    private  String avatarUrl;

    public UserShowedDto() {
    }

    public UserShowedDto(String userName, String email,
                         String firstName, String lastName,
                         String mobile, String address, String avatarUrl) {
        this.userName = userName;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.address = address;
        this.avatarUrl = avatarUrl;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}