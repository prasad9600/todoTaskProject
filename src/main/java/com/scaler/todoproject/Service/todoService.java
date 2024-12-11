package com.scaler.todoproject.Service;


import com.scaler.todoproject.Repository.taskRepo;
import com.scaler.todoproject.model.task;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class todoService {

    public taskRepo taskrepo;

    public todoService(taskRepo taskrepo){
        this.taskrepo = taskrepo;
    }

    public task addServiceTask(String title, String description, boolean isCompleted, Date created_at){
                task Task = new task();
                Task.setTitle(title);
                Task.setDescription(description);
                Task.setIs_completed(isCompleted);
                Task.setCreated_at(created_at);
                return taskrepo.save(Task);

    }

    public Optional<task> getTask(long id){
        return taskrepo.findById(id);
    }
}
