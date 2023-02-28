package com.module5.projectmodule5.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
 * A DTO for the {@link com.module5.projectmodule5.entity.User} entity
 */
@Data
public class UserCreationDto implements Serializable {
    @NotNull
    @Length(min = 5, max = 16, message = "must have between 5 and 16 characters")
    private final String userName;
    @Email
    private final String email;
    @NotNull
    private final String password;
    private final String firstName;
    @NotNull
    private final String lastName;
    @Length(min = 10, max = 10, message = "please enter 10 numbers mobile phone")
    private final String mobile;
    private final String address;
    private final String avatarUrl;
}