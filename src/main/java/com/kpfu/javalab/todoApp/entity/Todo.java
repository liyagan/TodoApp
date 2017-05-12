package com.kpfu.javalab.todoApp.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "todos")

public class Todo  implements Serializable {

    public static final int MAX_LENGTH_DESCRIPTION = 500;
    public static final int MAX_LENGTH_TITLE = 100;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String todoId;

    public String getId() {
        return todoId;
    }

    private String todoDescription;


    public void setId(String todoId) {
        this.todoId = todoId;
    }

    public String getTitle() {
        return todoTitle;
    }

    public void setTitle(String todoTitle) {
        this.todoTitle = todoTitle;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    private String todoTitle;

    private boolean finished;

    private Date createdAt;

    public Todo(String todoTitle,String todoDescription, boolean finished) {
        this.todoTitle = todoTitle;
        this.todoDescription = todoDescription;
        this.finished = finished;
        this.createdAt = new Date();
    }
    public Todo(){

    }


    public String getDescription() {
        return todoDescription;
    }

    public void setDescription(String todoDescription) {
        this.todoDescription = todoDescription;
    }
}