package com.example.demo.todo.application.port.out;

import org.springframework.stereotype.Component;

@Component
public interface DeleteTodoPort {

    void deleteTodo(Long id);
}
