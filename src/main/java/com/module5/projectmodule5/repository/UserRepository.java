package com.module5.projectmodule5.repository;

import com.module5.projectmodule5.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;

public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
    User findUserById(Long id);

    @Query("select u from User u where u.userName like ?1")
    User findUserByUserName(@NonNull String userName);

//    User findUserByUserName(String userName);
}