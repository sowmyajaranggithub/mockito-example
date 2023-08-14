package com.in28minutes.business;

import com.in28minutes.data.api.TodoService;

import java.util.ArrayList;
import java.util.List;

public class TodoBusinessImpl {
    private TodoService todoService;

    public TodoBusinessImpl (TodoService todoService) {
        super();
        this.todoService = todoService;
    }

    public List<String> retrieveTodosRelatedToSpring(String user) {
        List<String> filteredTodos = new ArrayList<String>();
        List<String> todos = todoService.retrieveTodos(user);
        for (String todo : todos)
            if (todo.contains("spring")) {
                filteredTodos.add(todo);
            }


        return filteredTodos;
    }
    public void deleteTodosNotRelatedToSpring(String user) {
        List<String> todos = todoService.retrieveTodos(user);
        for (String todo : todos)
            if (!todo.contains("spring")) {
                todoService.deleteTodo(todo);
            }



    }
}
