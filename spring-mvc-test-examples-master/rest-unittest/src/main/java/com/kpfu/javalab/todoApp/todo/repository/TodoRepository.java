package com.kpfu.javalab.todoApp.todo.repository;

import com.kpfu.javalab.todoApp.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
