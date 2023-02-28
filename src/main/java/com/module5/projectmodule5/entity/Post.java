package com.module5.projectmodule5.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "author_Id", nullable = false)
    private User authorId;
    @ManyToOne
    @JoinColumn(name = "postParent_Id", nullable = false)
    private Post postParentId;
//    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "post_postComment",
//            joinColumns = @JoinColumn(name = "post_Id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "postComment_Id", referencedColumnName = "id")
//    )
//    private Collection<PostComment> postComments = new ArrayList<>();

//    @ManyToMany
//    @JoinColumn(name = "postComment_Id")
//    private  Collection<PostComment> postComments=new ArrayList<>();
    private String title;
    private String metaTitle;
    private Enum<PublishedStatus> published;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date createdAt;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date updatedAt;
    @Lob
    private String content;

    public Post() {
    }

    public Post(Long id, User authorId,
                Post postParentId, String title,
                String metaTitle, Enum<PublishedStatus> published,
                Date createdAt, Date updatedAt, String content) {
        this.id = id;
        this.authorId = authorId;
        this.postParentId = postParentId;
        this.title = title;
        this.metaTitle = metaTitle;
        this.published = published;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getAuthorId() {
        return authorId;
    }

    public void setAuthorId(User authorId) {
        this.authorId = authorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public Post getPostParentId() {
        return postParentId;
    }

    public void setPostParentId(Post postParentId) {
        this.postParentId = postParentId;
    }


    public Enum<PublishedStatus> getPublished() {
        return published;
    }

    public void setPublished(Enum<PublishedStatus> published) {
        this.published = published;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }


    public Date getUpdatedAt() {
        return updatedAt;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
