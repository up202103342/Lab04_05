package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {
    List<Integer> list;
    @BeforeEach
    public void helper() {
        list = Arrays.asList(1,2,4,2,5);
    }
    @Test
    public void deduplicate() {
        class StubListSorter implements GenericListSorter{
            @Override public List<Integer> sort(List<Integer> list) {
                return  Arrays.asList(1, 2, 4, 5);
            }
        }
        StubListSorter sorter = new StubListSorter();
        ListDeduplicator deduplicator = new ListDeduplicator(sorter);
        List<Integer> distinct = deduplicator.deduplicate(list);
        Assertions.assertEquals(Arrays.asList(1, 2, 4, 5), distinct);
    }
    @Test
    public void bug_deduplicate_8726() {
        List<Integer> list = Arrays.asList(1,2,4,2);
        GenericListSorter sorter = Mockito.mock(GenericListSorter.class);
        ListDeduplicator deduplicator = new ListDeduplicator(sorter);
        Mockito.when(deduplicator.deduplicate(Mockito.anyList())).thenReturn(Arrays.asList(1, 2, 4));
        List<Integer> distinct = deduplicator.deduplicate(list);
        Assertions.assertEquals(Arrays.asList(1, 2, 4), distinct);
    }
}
