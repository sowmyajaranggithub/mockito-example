package com.in28minutes.business;

import com.in28minutes.data.api.TodoService;
import org.assertj.core.presentation.Representation;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.BDDAssumptions.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;



public class TodoBusinessImplMockTest {

    @Test
    public void testRetrieveTodosRelatedToSpring_usingAMock(){

        TodoService todServiceMock= mock(TodoService.class);
          List<String> todos = Arrays.asList("Learn advanced java","Learn junit tests",
                        "Learn MicroServices");
          when(todServiceMock.retrieveTodos("dummy")).thenReturn(todos);
        TodoBusinessImpl todoBusinessImpl =
                new TodoBusinessImpl(todServiceMock);

        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");
        assertEquals(0, filteredTodos.size());
    }

    public void testRetrieveTodosRelatedToSpring_withEmptyList() {

        TodoService todServiceMock = mock(TodoService.class);
        List<String> todos = Arrays.asList();
        when(todServiceMock.retrieveTodos("dummy")).thenReturn(todos);
        TodoBusinessImpl todoBusinessImpl =
                new TodoBusinessImpl(todServiceMock);

        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");
        assertEquals(0, filteredTodos.size());
    }
    public void testRetrieveTodosRelatedToSpring_usingBDD() {
//Given
        TodoService todServiceMock = mock(TodoService.class);

        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn Dance");
        given(todServiceMock.retrieveTodos("dummy")).withRepresentation((Representation) todos);
        TodoBusinessImpl todoBusinessImpl =
                new TodoBusinessImpl(todServiceMock);
//when
        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");

        assertThat(filteredTodos.size());
    }

    private void assertThat (int size) {

    }

    public void testRetrieveTodosNotRelatedToSpring_usingBDD() {
//Given
        TodoService todServiceMock = mock(TodoService.class);

        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn Dance");
        given(todServiceMock.retrieveTodos("dummy")).withRepresentation((Representation) todos);
        TodoBusinessImpl todoBusinessImpl =
                new TodoBusinessImpl(todServiceMock);
//when
    // todoBusinessImpl.deleteTodosRelatedToSpring("dummy");

        //Then
        verify(todServiceMock).deleteTodo("Learn to Dance");
        verify(todServiceMock, never()).deleteTodo("Learn Spring ");

    }


}