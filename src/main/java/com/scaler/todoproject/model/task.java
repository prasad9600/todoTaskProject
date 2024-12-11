package com.scaler.todoproject.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class task extends base {

    private String title;
    private String description;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }



//    id (primary key, auto-increment)
//    title (string)
//    description (string, optional)
//    is_completed (boolean, default false)
//    created_at (timestamp)
}
