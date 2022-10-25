package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

public class PositiveFilterTest {
    private int a = 0;

    private PositiveFilter filter = new PositiveFilter();

    @Test
    public void positivefilter1() {
        a = -5;
        Assertions.assertFalse(filter.accept(a));
    }
    @Test
    public void positivefilter2() {
        a = 2;
        Assertions.assertTrue(filter.accept(a));
    }
    @Test
    public void positivefilter3() {
        a = 0;
        Assertions.assertTrue(filter.accept(a));
    }
}
