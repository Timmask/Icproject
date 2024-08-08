package com.temirlan.spring.mvc.icproject.repository;

import com.temirlan.spring.mvc.icproject.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Integer> {
}
