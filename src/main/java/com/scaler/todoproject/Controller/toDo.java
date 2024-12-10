package com.scaler.todoproject.Controller;

import com.scaler.todoproject.DTO.requestTaskDTO;
import com.scaler.todoproject.Service.todoService;
import com.scaler.todoproject.model.task;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<task> addTask(@RequestBody requestTaskDTO requesttaskdto){
        task Task = todoservice.addServiceTask(
                requesttaskdto.getTitle(),
                requesttaskdto.getDescription(),
                requesttaskdto.getCreated_at());

        ResponseEntity<task> responseEntity;
        responseEntity = new ResponseEntity<>(Task, HttpStatusCode.valueOf(201));

        return responseEntity;
    }
}
