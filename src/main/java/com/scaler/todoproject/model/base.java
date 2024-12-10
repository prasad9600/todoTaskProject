package com.scaler.todoproject.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class base {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private boolean is_completed;
    private Date created_at;
}
