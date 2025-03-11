package com.scaler.todoproject.Service;

import com.scaler.todoproject.Repository.taskRepo;
import com.scaler.todoproject.model.task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class searchService {

    private final com.scaler.todoproject.Repository.taskRepo taskRepo;

    public searchService(taskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    public Page<task> service(String query, int pageNumber, int size){
        Sort sort = Sort.by("id").descending();
        Pageable pageable = PageRequest.of(pageNumber,size,sort);

        return taskRepo.findByTitleContaining(query, pageable);
    }
}
