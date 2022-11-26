package com.example.demo.todo.adaptor.out.persistence;

import com.example.demo.todo.application.port.out.DeleteTodoPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TodoPersistenceAdaptor implements DeleteTodoPort {

    private final TodoRepository todoRepository;

    @Override
    public void deleteTodo(Long id) {
        TodoJpaEntity todoJpaEntity = todoRepository.findById(id).orElseThrow(RuntimeException::new);

        todoRepository.delete(todoJpaEntity);
    }
}
