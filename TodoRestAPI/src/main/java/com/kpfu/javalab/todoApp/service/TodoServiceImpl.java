package com.kpfu.javalab.todoApp.service;

import com.kpfu.javalab.todoApp.entity.Todo;
import com.kpfu.javalab.todoApp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Лия on 03.05.2017.
 */
@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    TodoRepository todoRepository;

    @Override
    public List<Todo> getAllTodos() {
        List<Todo> todos = new ArrayList<>();
        todos.add(new Todo("Fuck you","Fuck you", false));
        todos.add(new Todo("Fuck them","Fuck you", false));
        todos.add(new Todo("Fuck us","Fuck you", false));
        todos.add(new Todo("Fuck you","Fuck you", false));
        return todos;
    }


    @Override
    public Todo add(Todo todo) {
        return todoRepository.save(todo);
    }

    //FIXME: ДОДЕЛАТЬ НУ
    @Override
    public Todo update(Todo todo) {
        Todo model = findById(Long.valueOf(todo.getId()));
        return null;
    }

    @Override
    public void deleteById(Long id) {
        todoRepository.delete(id);
    }

    @Override
    public List<Todo> findAll() {
        return (List<Todo>) todoRepository.findAll();
    }

    @Override
    public Todo findById(Long id) {
        return todoRepository.findOne(id);
    }
}
