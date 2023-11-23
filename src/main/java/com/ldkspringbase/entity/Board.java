package com.ldkspringbase.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int boardId;
    private String userName;
    private String title;
    private String content;
    private LocalDateTime postDate;
    private int views;

    public Object getBoardId() {
        return boardId;
    }
    public Object getUserName() {
        return userName;
    }
    public Object getTitle() {
        return title;
    }
    public Object getContent() {
        return content;
    }
    public Object getPostDate() {
        return postDate;
    }
    public Object getViews() {
        return views;
    }

    public void setBoardId(Object boardId){this.boardId = (int) boardId;}
    public void setUserName(Object userName) {
        this.userName = (String) userName;
    }

    public void setTitle(Object title) {
        this.title = (String) title;
    }

    public void setContent(Object content) {
        this.content = (String) content;
    }

    public void setPostDate(Object postDate) {
        this.postDate = (LocalDateTime) postDate;
    }

    public void setViews(Object views) {
        this.views = (int) views;
    }
}