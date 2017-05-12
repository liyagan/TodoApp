package com.kpfu.javalab.todoApp.todo.exception;

/**
 * @author Petri Kainulainen
 */
public class TodoNotFoundException extends Exception {

    public TodoNotFoundException(String message) {
        super(message);
    }

}
