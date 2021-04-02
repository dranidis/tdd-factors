package com.se.tdd;

import java.util.ArrayList;
import java.util.List;

public class Factor {

    public static List<Integer> getFactors(int i) {
        List<Integer> list = new ArrayList<>();

        for (int divisor = 2; i > 1; divisor++)
            for (; i % divisor == 0; i /= divisor)
                list.add(divisor);

        return list;
    }

}
