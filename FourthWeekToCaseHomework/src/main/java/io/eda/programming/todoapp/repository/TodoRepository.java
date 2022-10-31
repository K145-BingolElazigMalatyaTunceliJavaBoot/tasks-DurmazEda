package io.eda.programming.todoapp.repository;

import io.eda.programming.todoapp.entity.Todo;
import io.eda.programming.todoapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {
}
