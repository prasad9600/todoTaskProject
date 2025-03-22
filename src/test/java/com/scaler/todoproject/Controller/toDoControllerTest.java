package com.scaler.todoproject.Controller;

import com.scaler.todoproject.Service.todoService;
import com.scaler.todoproject.model.task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
public class toDoControllerTest {

    @MockitoBean
    public todoService todoservicedummy;

    @Autowired
    public toDoController toDoController;

    @Test
    void getAllTask() {
        task Task = new task();
        Task.setTitle("abc");
        Task.setDescription("def");

        task Task2 = new task();
        Task2.setTitle("abc1");
        Task2.setDescription("def1");

        List<task> dummyTasks = new ArrayList<>();
        dummyTasks.add(Task);
        dummyTasks.add(Task2);

        when(todoservicedummy.getTasks()).thenReturn(dummyTasks);

        ResponseEntity<List<task>> responseEntitydummy = toDoController.getAllTask();
        Assertions.assertEquals(2, responseEntitydummy.getBody().size());
        Assertions.assertEquals("abc", responseEntitydummy.getBody().get(0).getTitle());
        Assertions.assertEquals("abc1",responseEntitydummy.getBody().get(1).getTitle());

    }
}