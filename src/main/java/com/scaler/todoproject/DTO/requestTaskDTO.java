package com.scaler.todoproject.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class requestTaskDTO {

    private String title;
    private String description;
    private boolean is_completed;
    private Date created_at;

}
