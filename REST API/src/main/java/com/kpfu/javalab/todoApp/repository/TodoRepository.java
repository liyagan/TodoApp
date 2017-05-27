package com.kpfu.javalab.todoApp.repository;

import com.kpfu.javalab.todoApp.entity.Todo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Лия on 03.05.2017.
 */

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
