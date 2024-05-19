package com.example;

import java.time.Duration;
import java.time.LocalTime;

public abstract class ToDoItemState {
    protected ToDoItem toDoItem;

    public ToDoItemState(ToDoItem t){
        toDoItem = t;
    }

    public void start() {}

    public void addComment(String comment){
        this.toDoItem.getComments().add(comment);
    }

    public Duration workedTime(){
        return Duration.between(this.toDoItem.getStart(), LocalTime.now());
    }

    public abstract void togglePause();

    public abstract void finish();
}
