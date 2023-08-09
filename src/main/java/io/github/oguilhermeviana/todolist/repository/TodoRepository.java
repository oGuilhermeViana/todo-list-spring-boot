package io.github.oguilhermeviana.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.oguilhermeviana.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
