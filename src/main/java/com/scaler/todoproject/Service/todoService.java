package com.scaler.todoproject.Service;


import com.scaler.todoproject.Repository.taskRepo;
import com.scaler.todoproject.model.task;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class todoService {

    public taskRepo taskrepo;

    public todoService(taskRepo taskrepo){
        this.taskrepo = taskrepo;
    }

    public task addServiceTask(String title, String description, Date created_at){
                task Task = new task();
                Task.setTitle(title);
                Task.setDescription(description);
                Task.setCreated_at(created_at);
                return taskrepo.save(Task);

    }
}
