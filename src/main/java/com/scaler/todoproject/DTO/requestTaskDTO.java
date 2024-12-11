package com.scaler.todoproject.DTO;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@Setter
@Getter


public class requestTaskDTO {


        private String title;
        private String description;
        @NotNull
        private boolean is_completed;
        private Date created_at;

        // Getter for title
        public String getTitle() {
            return title;
        }

        // Setter for title
        public void setTitle(String title) {
            this.title = title;
        }

        // Getter for description
        public String getDescription() {
            return description;
        }

        // Setter for description
        public void setDescription(String description) {
            this.description = description;
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
        public Date getCreated_at() {
            return created_at;
        }

        // Setter for created_at
        public void setCreated_at(Date created_at) {
            this.created_at = created_at;
        }
    }





