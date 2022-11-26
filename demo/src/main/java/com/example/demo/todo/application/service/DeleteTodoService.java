package com.example.demo.todo.application.service;

import com.example.demo.todo.application.port.in.DeleteTodoCommand;
import com.example.demo.todo.application.port.in.DeleteTodoUseCase;
import com.example.demo.todo.application.port.out.DeleteTodoPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteTodoService implements DeleteTodoUseCase {

    private final DeleteTodoPort deleteTodoPort;

    @Override
    public void delete(DeleteTodoCommand command) {
        checkCommand(command);

        deleteTodoPort.deleteTodo(command.getId());
    }

    private void checkCommand(DeleteTodoCommand deleteTodoCommand) {
        // validate
    }
}
