package com.kpfu.javalab.todoApp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kpfu.javalab.todoApp.entity.Todo;
import com.kpfu.javalab.todoApp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/**
 * Created by Лия on 03.05.2017.
 */
@RestController
public class TodoController {

    @Autowired
    TodoService todoService;

    @RequestMapping(value = "/api/todo", method = RequestMethod.POST)
    @ResponseBody
    public Todo add(@Valid @RequestBody Todo todo) {
        return todoService.add(todo);
    }

    @RequestMapping(value = "/api/todo/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteById(@PathVariable("id") Long id) {

        todoService.deleteById(id);
    }

    @RequestMapping(value = "/api/todo", method = RequestMethod.GET)
    @ResponseBody
    public List<Todo> findAll() {

        return todoService.findAll();
    }


    @RequestMapping(value = "/api/todo/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Todo findById(@PathVariable("id") Long id) {

        return todoService.findById(id);
    }


}
