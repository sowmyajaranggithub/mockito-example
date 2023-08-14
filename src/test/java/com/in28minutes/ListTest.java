package com.in28minutes;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void letsMockListSizeMethod(){

        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);
        assertEquals(2,listMock.size());
        assertEquals(2,listMock.size());
        assertEquals(2,listMock.size());

    }
    @Test
    public void letsMockListSizeMultipleValues(){

        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(2).thenReturn(3);
        assertEquals(2,listMock.size());
        assertEquals(2,listMock.size());
        assertEquals(3,listMock.size());

    }
    @Test
    public void letsMockListSizeMultipleGet() {

        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("in28minutes");
        assertEquals("in28minutes", listMock.get(0));
        assertEquals(null, listMock.get(1));

    }
}
