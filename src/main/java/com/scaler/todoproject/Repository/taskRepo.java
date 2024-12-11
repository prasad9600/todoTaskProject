package com.scaler.todoproject.Repository;


import com.scaler.todoproject.model.task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface taskRepo extends JpaRepository<task,Long> {


        public task save(task Task);

        public Optional<task> findById(long id);
}
