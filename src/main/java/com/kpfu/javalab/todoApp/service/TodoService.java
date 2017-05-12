package com.kpfu.javalab.todoApp.service;

import com.kpfu.javalab.todoApp.entity.Todo;

import java.util.List;

/**
 * Created by Лия on 03.05.2017.
 */

public interface TodoService {

    List<Todo> getAllTodos();

    Todo add(Todo todo);

    Todo update(Todo todo);

   void deleteById(Long id);

    List<Todo> findAll();

    Todo findById(Long id);
}
