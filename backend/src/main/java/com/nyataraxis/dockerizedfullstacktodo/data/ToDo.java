package com.nyataraxis.dockerizedfullstacktodo.data;

import org.springframework.data.annotation.Id;

public class ToDo {

    @Id
    private String id;

    private String title;

    private Boolean isCompleted;

    public ToDo(String title, Boolean isCompleted){
        this.title = title;
        this.isCompleted = isCompleted;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getIsCompleted() {
        return isCompleted;
    }

}
