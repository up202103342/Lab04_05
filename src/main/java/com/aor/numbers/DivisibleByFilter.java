package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter {
    public DivisibleByFilter(int n) {i = n;}
    private int i;
    public boolean accept(Integer number) {
        if (number % i == 0) { return true; }
        return false;
    }
}
