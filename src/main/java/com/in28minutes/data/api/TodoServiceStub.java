package com.in28minutes.data.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService{

    public List<String> retrieveTodos(String user) {
        return Arrays.asList("Learn advanced java","Learn junit tests",
                "Learn MicroServices");


    }

    @Override
    public void deleteTodo (String todo) {

    }
}
