package com.scaler.todoproject.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class searchRequestDTO {
    private String query;
    private int pageNumber;
    private int size;



    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
