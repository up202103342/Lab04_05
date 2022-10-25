package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class DivisibleByFilterTest {
    private int a = 0;
    private DivisibleByFilter filter;
    @Test
    public void divisibleby1() {
        a = 3;
        filter = new DivisibleByFilter(3);
        Assertions.assertTrue(filter.accept(a));
    }
    @Test
    public void divisibleby2() {
        a = 4;
        filter = new DivisibleByFilter(3);
        Assertions.assertFalse(filter.accept(a));
    }

    @Test
    public void divisibleby3() {
        a = 8;
        filter = new DivisibleByFilter(4);
        Assertions.assertTrue(filter.accept(a));
    }
    @Test
    public void divisibleby4() {
        a = 2;
        filter = new DivisibleByFilter(4);
        Assertions.assertFalse(filter.accept(a));
    }
}
