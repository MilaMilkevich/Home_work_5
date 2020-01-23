package main.java.hw5.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList<T extends Number & Comparable<? super T>> {
    private List<T> list = new ArrayList<>();

    public void addElement(T element) {
        list.add(element);
    }

    public T getSmallestValue() {
        return Collections.min(list);

    }

    public T getBiggestValue() {
        return Collections.max(list);
    }
}
