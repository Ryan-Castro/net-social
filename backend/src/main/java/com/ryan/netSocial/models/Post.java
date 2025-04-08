package com.ryan.netSocial.models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long postID;
    private String title;
    private  String content;
    private Date date;
    @ManyToOne
    private User userID;

    public Post() {
    }

    public Post(final Long postID, final String title, final String content, final Date date, final User userID) {
        this.postID = postID;
        this.title = title;
        this.content = content;
        this.date = date;
        this.userID = userID;
    }

    public Long getPostID() {
        return postID;
    }

    public void setPostID(Long postID) {
        this.postID = postID;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }
}
