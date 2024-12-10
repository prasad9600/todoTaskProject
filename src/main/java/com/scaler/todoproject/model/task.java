package com.scaler.todoproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class task extends base {

    String title;
    String description;



//    id (primary key, auto-increment)
//    title (string)
//    description (string, optional)
//    is_completed (boolean, default false)
//    created_at (timestamp)
}
