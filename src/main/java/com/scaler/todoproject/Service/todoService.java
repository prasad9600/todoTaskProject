package com.scaler.todoproject.Service;


import com.scaler.todoproject.DTO.requestTaskDTO;
import com.scaler.todoproject.Exception.ItemNotFoundException;
import com.scaler.todoproject.Repository.taskRepo;
import com.scaler.todoproject.model.task;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
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

    public List<task> getTasks(){
        return taskrepo.findAll();
    }

    public task updateItem(Long id, requestTaskDTO requesttaskdto){
        // Update the existing
        return taskrepo.findById(id).map(existingTask ->{
            existingTask.setTitle(requesttaskdto.getTitle());
            existingTask.setDescription(requesttaskdto.getDescription());
            existingTask.setIs_completed(requesttaskdto.isIs_completed());
            existingTask.setCreated_at(requesttaskdto.getCreated_at());
                    // create a new with same ID
            return taskrepo.save(existingTask);
        })
            .orElseThrow(() -> new ItemNotFoundException("Item with ID " + id + " not found"));
    }
    @Transactional
    public void deleteItemByTitle(String title) throws ItemNotFoundException{
        if(taskrepo.existsByTitle(title)){
            taskrepo.deleteByTitle(title);
        }else{
            throw new ItemNotFoundException("Item with title " + title + " not found");
        }

    }
}
