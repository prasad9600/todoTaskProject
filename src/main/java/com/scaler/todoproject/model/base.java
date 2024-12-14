package com.scaler.todoproject.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;


import lombok.Getter;
import lombok.Setter;


import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class base {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private boolean is_completed;

    private Date created_at;

    // Getter for id
    public long getId() {
        return id;
    }

    // Setter for id
    public void setId(long id) {
        this.id = id;
    }

    // Getter for is_completed
    public boolean isIs_completed() {
        return is_completed;
    }

    // Setter for is_completed
    public void setIs_completed(boolean is_completed) {
        this.is_completed = is_completed;
    }

    // Getter for created_at
//    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")
    public Date getCreated_at() {
        return created_at;
    }

    // Setter for created_at
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

}
