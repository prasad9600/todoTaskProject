package com.scaler.todoproject.Controller;

import com.scaler.todoproject.DTO.searchRequestDTO;

import com.scaler.todoproject.Service.searchService;
import com.scaler.todoproject.model.task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class searchControllerTest {

    @MockitoBean
    public searchService searchservice;

    @Autowired
    public searchController SearchController;

    @Test
    void search() {

        List<task> mockTasks = new ArrayList<>();

        task Task = new task();
        Task.setTitle("Task");
        Task.setDescription("My Task");

        task Task2 = new task();
        Task2.setTitle("Task2");
        Task2.setDescription("My Task2");

        mockTasks.add(Task);
        mockTasks.add(Task2);

        searchRequestDTO SearchRequestDTO = new searchRequestDTO();
        SearchRequestDTO.setQuery("query");
        SearchRequestDTO.setPageNumber(0);
        SearchRequestDTO.setSize(2);
        Pageable pageable = PageRequest.of(SearchRequestDTO.getPageNumber(), SearchRequestDTO.getSize());

        Page<task> mockPage = new PageImpl<>(mockTasks, pageable, mockTasks.size());

        when(searchservice.service(SearchRequestDTO.getQuery(), SearchRequestDTO.getPageNumber(), SearchRequestDTO.getSize())).thenReturn(mockPage);

        Page<task> response = SearchController.search(SearchRequestDTO);

    }
}