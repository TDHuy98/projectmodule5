package com.module5.projectmodule5.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class PostComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @Column(name = "post_Id")
    private Post postId;
    @ManyToOne
    @Column(name = "postComment_Id")
    private PostComment postCommentId;
    private String title;
    private String content;
    private boolean published;
//    private Date createdAt;
//    private Date updatedAt;


    
}
