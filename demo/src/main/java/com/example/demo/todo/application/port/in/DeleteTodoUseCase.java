package com.example.demo.todo.application.port.in;

import org.springframework.stereotype.Component;

@Component
public interface DeleteTodoUseCase {

    void delete(DeleteTodoCommand deleteTodoCommand);
}
