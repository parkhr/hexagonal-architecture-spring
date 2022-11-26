package com.example.demo.todo.application.port.in;

import com.example.demo.todo.adaptor.in.web.dto.TodoDeleteRequestDto;
import lombok.Getter;

@Getter
public class DeleteTodoCommand {
    private Long id;

    public DeleteTodoCommand(TodoDeleteRequestDto dto){
        this.id = dto.getId();
    }
}
