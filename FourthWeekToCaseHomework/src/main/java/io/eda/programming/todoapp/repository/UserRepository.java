package io.eda.programming.todoapp.repository;

import io.eda.programming.todoapp.entity.Todo;
import io.eda.programming.todoapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
}
