package com.ryan.netSocial.models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long commentId;
    private String comment;
    private Date date;

    @ManyToOne
    private Long postId;
    @ManyToOne
    private Long userID;

    public Comment() {
    }

    public Comment(final Long commentId, final String comment, final Date date, final Long postId, final Long userID) {
        this.commentId = commentId;
        this.comment = comment;
        this.date = date;
        this.postId = postId;
        this.userID = userID;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }
}
