package com.in28minutes.data.api;

import java.util.Arrays;
import java.util.List;

public interface TodoService  {

    List<String> retrieveTodos(String user);

    void deleteTodo (String todo);
}
