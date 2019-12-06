package com.kodilla.spring.portfolio;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class )
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
    //Given
    ApplicationContext context =
            new AnnotationConfigApplicationContext("com.kodilla.spring");
    Board board = context.getBean(Board.class);
    //When
    board.getToDoList().getTasks().add("TaskToDo");
    board.getInProgressList().getTasks().add("TaskInProgress");
    board.getDoneList().getTasks().add("TaskGetDone");
    //Then
    Assert.assertEquals("TaskToDo", board.getToDoList().getTasks().get(0));
    Assert.assertEquals("TaskInProgress", board.getInProgressList().getTasks().get(0));
    Assert.assertEquals("TaskGetDone", board.getDoneList().getTasks().get(0));
    }
}
