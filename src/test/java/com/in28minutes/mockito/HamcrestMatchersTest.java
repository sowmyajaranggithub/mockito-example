package com.in28minutes.mockito;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestMatchersTest {

    @Test
    public void test(){
List<Integer> scores = Arrays.asList(99,00, 101, 105);
assertThat(scores, hasSize(4));
     //   assertThat(scores, hasItems(99,100));
        assertThat(scores, everyItem(greaterThan(90)));

    }

    private Matcher<Collection<?>> everyItem (Object o) {
    return null;
    }

    private Object greaterThan (int i) {
        return null;
    }

    private void assertThat (List<Integer> scores, Matcher<Collection<?>> collectionMatcher) {


    }


}
