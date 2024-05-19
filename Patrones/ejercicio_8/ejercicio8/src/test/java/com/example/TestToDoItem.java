package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestToDoItem {
    private ToDoItem tdi;

    @BeforeEach
    void setUp(){
        tdi = new ToDoItem("Mi ToDoItem");
        tdi.start();
        tdi.addComment("Hola");
    }

    @Test
    void TestComments(){
        tdi.addComment("Mundo");
        String comments = "";
        List<String> list = tdi.getComments();
        for (String comm: list){
            comments+= comm + " ";
        }
        assertEquals("Hola Mundo", comments.trim());
    }

    @Test
    void TestWorkedTimeCurrentSeconds(){
        assertEquals(Duration.between(tdi.getStart(), LocalTime.now()).getSeconds(), tdi.workedTime().getSeconds());
    }

    @Test
    void TestWorkedTimeFinished(){
        tdi.finish();
        assertEquals(Duration.between(tdi.getStart(), LocalTime.now()).getSeconds(), tdi.workedTime().getSeconds()); 
    }
}
