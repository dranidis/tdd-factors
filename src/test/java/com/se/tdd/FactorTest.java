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

    @Test
    public void getFactors_of_2_returns_2() {
        assertEquals(Arrays.asList(2), Factor.getFactors(2));
    }

    @Test
    public void getFactors_of_3_returns_3() {
        assertEquals(Arrays.asList(3), Factor.getFactors(3));
    }

    @Test
    public void getFactors_of_4_returns_2_2() {
        assertEquals(Arrays.asList(2, 2), Factor.getFactors(4));
    }

    @Test
    public void getFactors_of_5_returns_5() {
        assertEquals(Arrays.asList(5), Factor.getFactors(5));
    }

    @Test
    public void getFactors_of_6_returns_2_3() {
        assertEquals(Arrays.asList(2, 3), Factor.getFactors(6));
    }

    @Test
    public void getFactors_of_7_returns_7() {
        assertEquals(Arrays.asList(7), Factor.getFactors(7));
    }

}
