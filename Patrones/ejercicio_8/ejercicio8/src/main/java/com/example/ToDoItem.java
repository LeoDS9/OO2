package com.example;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
    private String nombre;
    private List<String> comments;
    private ToDoItemState state;
    private LocalTime start, end;

    /**
    * Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
    */
    public ToDoItem(String name){
        state = new Pending(this);
        comments = new ArrayList<>();
        nombre = name;
    }

    public void setState(ToDoItemState state){
        this.state = state;
    }

    public LocalTime getStart(){
        return start;
    }

    
    public LocalTime getEnd(){
        return end;
    }

    public void setEnd(LocalTime e){
        end = e;
    }

    public List<String> getComments(){
        return comments;
    }
    /**
    * Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
    * pending. Si se encuentra en otro estado, no hace nada.
    */
    public void start(){
        start = LocalTime.now();
        state.start();
    }

    /**
    * Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
    * estado es paused. Caso contrario (pending o finished) genera un error
    * informando la causa específica del mismo.
    */
    public void togglePause(){
        state.togglePause();
    }


    /**
    * Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
    * in-progress o paused. Si se encuentra en otro estado, no hace nada.
    */
    public void finish(){
        state.finish();
    }


    /**
    * Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
    * hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
    * haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
    * genera un error informando la causa específica del mismo.
    */
    public Duration workedTime(){
        return state.workedTime();
    }


    /**
    * Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
    * contrario no hace nada."
    */
    public void addComment(String comment){
        state.addComment(comment);
    }

}
