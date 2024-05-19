package com.example;

import java.time.Duration;

public class Pending extends ToDoItemState{
    
    public Pending(ToDoItem t){
        super(t);
    }

    @Override
    public void start() {
        this.toDoItem.setState(new InProgress(toDoItem));
    }

    @Override
    public void togglePause() {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }

    @Override
    public void finish() {}

    @Override
    public Duration workedTime() {
        throw new RuntimeException("El ToDoItem no se inició.");
    }

    

    
}