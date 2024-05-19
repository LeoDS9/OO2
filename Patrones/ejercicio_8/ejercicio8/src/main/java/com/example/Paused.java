package com.example;

import java.time.LocalTime;

public class Paused extends ToDoItemState{
    public Paused(ToDoItem t){
        super(t);
    }

    @Override
    public void togglePause() {
        this.toDoItem.setState(new InProgress(toDoItem));
    }

    public void finish() {
        this.toDoItem.setEnd(LocalTime.now());
        this.toDoItem.setState(new Finished(toDoItem));
    }

}
