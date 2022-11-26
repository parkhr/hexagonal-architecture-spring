package com.example.demo.todo.adaptor.in.web;

import com.example.demo.todo.adaptor.in.web.dto.TodoDeleteRequestDto;
import com.example.demo.todo.application.port.in.DeleteTodoCommand;
import com.example.demo.todo.application.port.in.DeleteTodoUseCase;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TodoController {

    private final DeleteTodoUseCase deleteTodoUseCase;

    @DeleteMapping("/todo")
    public void removeTodo(@Valid @RequestBody TodoDeleteRequestDto todoDeleteRequestDto) {

        DeleteTodoCommand command = new DeleteTodoCommand(todoDeleteRequestDto);
        deleteTodoUseCase.delete(command);
    }
}