package com.se.tdd;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

/**
 * Unit test
 */
public class FactorTest {

    @Test
    public void getFactors_of_1_returns_emptyList() {
        assertEquals(Arrays.asList(), Factor.getFactors(1));
    }

}
