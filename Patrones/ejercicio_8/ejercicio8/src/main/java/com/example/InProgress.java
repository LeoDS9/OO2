package com.example;

import java.time.LocalTime;

public class InProgress extends ToDoItemState {

    public InProgress(ToDoItem t){
        super(t);
    }

    @Override
    public void togglePause() {
        this.toDoItem.setState(new Paused(toDoItem));
    }
    @Override
    public void finish() {
        this.toDoItem.setEnd(LocalTime.now());
        this.toDoItem.setState(new Finished(toDoItem));
    }

    

}