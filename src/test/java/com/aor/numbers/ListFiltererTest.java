package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class ListFiltererTest {
    @Test
    public void listfilterer() {
        class StubListFilterer implements GenericListFilter{
            @Override
            public boolean accept(Integer number) {
                return false;
            }
        }
        StubListFilterer filter = new StubListFilterer();
        ListFilterer filterer = new ListFilterer(filter);
        List<Integer> distinct = filterer.filter(Arrays.asList(1, 2, 4, 5));
        Assertions.assertEquals(Arrays.asList(), distinct);
    }
}
