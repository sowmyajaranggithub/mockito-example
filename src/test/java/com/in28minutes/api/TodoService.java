package com.in28minutes.api;

import java.util.List;

public interface TodoService {
    public List<String> retrieveTodos (String user);

    public void deleteTodo (String todo);

    public default void deleteTodosRelatedToSpring (String springValue) {
        // Method implementation
    }
}
