package com.scaler.todoproject.Controller;

import com.scaler.todoproject.DTO.requestTaskDTO;
import com.scaler.todoproject.Service.todoService;
import com.scaler.todoproject.model.task;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class toDo {

    public todoService todoservice;

    public toDo(todoService todoservice){
        this.todoservice=todoservice;
    }

    @PostMapping("/tasks")
    public task addTask(@RequestBody requestTaskDTO requesttaskdto){
        return todoservice.addServiceTask(requesttaskdto.getTitle(),requesttaskdto.getDescription(),
                requesttaskdto.getCreated_at());
    }
}
