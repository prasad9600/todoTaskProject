package com.scaler.todoproject.Controller;


import com.scaler.todoproject.DTO.searchRequestDTO;
import com.scaler.todoproject.Service.searchService;

import com.scaler.todoproject.model.task;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class searchController {

    private searchService searchservice;

    public searchController(searchService searchservice) {
        this.searchservice = searchservice;
    }
    @PostMapping("/search")
    public Page<task> search(@RequestBody searchRequestDTO searchrequestDTO) {
        return searchservice.service(searchrequestDTO.getQuery(),searchrequestDTO.getPageNumber(),searchrequestDTO.getSize());
    }
}
