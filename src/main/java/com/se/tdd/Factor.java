package com.se.tdd;

import java.util.ArrayList;
import java.util.List;

public class Factor {

    public static List<Integer> getFactors(int i) {
        List<Integer> list = new ArrayList<>();
        if (i > 1) {
            while (i % 2 == 0) {
                list.add(2);
                i /= 2;
            }
            while (i % 3 == 0) {
                list.add(3);
                i /= 3;
            }
        }
        if (i > 1)
            list.add(i);
        return list;
    }

}
