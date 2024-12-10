package com.scaler.todoproject.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class requestTaskDTO {

    String title;
    String description;
    boolean is_completed;
    Date created_at;

}
