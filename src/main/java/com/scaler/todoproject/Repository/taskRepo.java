package com.scaler.todoproject.Repository;

import com.scaler.todoproject.DTO.requestTaskDTO;
import com.scaler.todoproject.model.task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface taskRepo extends JpaRepository<task,Long> {

        public task save(task Task);
}
