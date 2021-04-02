package com.se.tdd;

import java.util.ArrayList;
import java.util.List;

public class Factor {

    public static List<Integer> getFactors(int i) {
        List<Integer> list = new ArrayList<>();
        int divisor = 2;
        while (i > 1) {
            while (i % divisor == 0) {
                list.add(divisor);
                i /= divisor;
            }
            divisor++;
        }
        return list;
    }

}
