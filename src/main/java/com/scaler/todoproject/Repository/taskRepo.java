package com.scaler.todoproject.Repository;


import com.scaler.todoproject.model.task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface taskRepo extends JpaRepository<task,Long> {


        public task save(task Task);

        public Optional<task> findById(long id);

        public List<task> findAll();


       // public boolean existsById(long id);
      // @Query("SELECT COUNT(t) > 0 FROM task t WHERE t.title = :title")
        //@Param("title")
        public boolean existsByTitle(String title);


       // public void deleteById(long id);

        public void deleteByTitle(String title);


        public Page<task> findByTitleContaining(String title, Pageable pageable);


}
