package com.module5.projectmodule5.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

@Entity
public class PostComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "post_Id")
    private Post postId;
    @ManyToOne
    @JoinColumn(name = "postCommentParent_Id")
    private PostComment postComments;

    @ManyToOne
    @JoinColumn(name = "user_Id")
    private User user;
    private String title;
    @Lob
    private String content;
    private boolean published;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date createdAt;
    @DateTimeFormat(pattern = "dd/MM/yyyy")

    private Date updatedAt;


    public PostComment() {
    }

    public PostComment(Long id, Post postId, PostComment postComments, User user, String title, String content, boolean published, Date createdAt, Date updatedAt) {
        this.id = id;
        this.postId = postId;
        this.postComments = postComments;
        this.user = user;
        this.title = title;
        this.content = content;
        this.published = published;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Post getPostId() {
        return postId;
    }

    public void setPostId(Post postId) {
        this.postId = postId;
    }

    public PostComment getPostComments() {
        return postComments;
    }

    public void setPostComments(PostComment postComments) {
        this.postComments = postComments;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
