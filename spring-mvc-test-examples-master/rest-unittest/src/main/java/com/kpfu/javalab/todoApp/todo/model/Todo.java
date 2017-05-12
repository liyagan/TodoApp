package com.kpfu.javalab.todoApp.todo.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;


@Entity
@Table(name="todos")
public class Todo {

    public static final int MAX_LENGTH_DESCRIPTION = 500;
    public static final int MAX_LENGTH_TITLE = 100;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "creation_time", nullable = false)
    private DateTime creationTime;

    @Column(name = "description", nullable = true, length = MAX_LENGTH_DESCRIPTION)
    private String description;

    @Column(name = "title", nullable = false, length = MAX_LENGTH_TITLE)
    private String title;

    public Todo() {

    }

    public Long getId() {
        return id;
    }

    public DateTime getCreationTime() {
        return creationTime;
    }

    public String getDescription() {
        return description;
    }



    public String getTitle() {
        return title;
    }


    @PrePersist
    public void prePersist() {
        DateTime now = DateTime.now();
        creationTime = now;
    }


    public void update(String description, String title) {
        this.description = description;
        this.title = title;
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
