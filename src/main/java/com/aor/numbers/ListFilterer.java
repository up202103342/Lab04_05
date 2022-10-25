package com.aor.numbers;
import java.util.ArrayList;
import java.util.List;

public class ListFilterer {
    private GenericListFilter f;

    public ListFilterer(GenericListFilter filter) { f = filter; }

    public List<Integer> filter(List<Integer> list) {
        List<Integer> l = new ArrayList<>();
        for (int i : list)
            if (f.accept(i)) l.add(i);
        return l;
    }
}