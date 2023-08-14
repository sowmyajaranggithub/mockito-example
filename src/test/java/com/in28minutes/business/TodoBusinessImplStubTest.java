package com.in28minutes.business;

import com.in28minutes.data.api.TodoService;
import com.in28minutes.data.api.TodoServiceStub;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoBusinessImplStubTest {

    @Test
    public void testRetrieveTodosRelatedToSpring_usingAStub(){
        TodoService todServiceStub= new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl =
                new TodoBusinessImpl(todServiceStub);
        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");
        assertEquals(0, filteredTodos.size());
    }

}
