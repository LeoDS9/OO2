package com.example;

import java.time.Duration;

public class Finished extends ToDoItemState{
    public Finished(ToDoItem t){
        super(t);
    }

    public void togglePause() {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }

    @Override
    public void finish() {}

    @Override
    public Duration workedTime(){
        return Duration.between(this.toDoItem.getStart(), this.toDoItem.getEnd());
    }
}
