package com.se.tdd;

import java.util.ArrayList;
import java.util.List;

public class Factor {

    public static List<Integer> getFactors(int i) {
        List<Integer> list = new ArrayList<>();
        if (i > 1)
            list.add(i);
        return list;
    }

}
