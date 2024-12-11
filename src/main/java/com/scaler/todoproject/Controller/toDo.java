package com.scaler.todoproject.Controller;

import com.scaler.todoproject.DTO.requestTaskDTO;
import com.scaler.todoproject.Service.todoService;
import com.scaler.todoproject.model.task;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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
                requesttaskdto.isIs_completed(),
                requesttaskdto.getCreated_at());

        ResponseEntity<task> responseEntity;
        responseEntity = new ResponseEntity<>(Task, HttpStatusCode.valueOf(201));

        return responseEntity;
    }
    @GetMapping("/task/{id}")
    public ResponseEntity<?> taskId(@PathVariable("id") long id ){
        Optional<task> Task=todoservice.getTask(id);

        if(Task.isPresent()){
            return ResponseEntity.ok(Task.get());
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No data found for ID: "+id);
        }
    }


}
