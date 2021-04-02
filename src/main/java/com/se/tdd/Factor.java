package com.se.tdd;

import java.util.ArrayList;
import java.util.List;

public class Factor {

    public static List<Integer> getFactors(int i) {
        List<Integer> list = new ArrayList<>();
        int divisor = 2;
        while (i > 1) {
            for (; i % divisor == 0; i /= divisor)
                list.add(divisor);
            divisor++;
        }
        return list;
    }

}
