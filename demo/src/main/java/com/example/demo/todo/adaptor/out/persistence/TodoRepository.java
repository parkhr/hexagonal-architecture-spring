package com.example.demo.todo.adaptor.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoJpaEntity, Long> {

}
