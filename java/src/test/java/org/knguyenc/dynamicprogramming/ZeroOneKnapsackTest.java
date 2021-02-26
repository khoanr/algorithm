package org.knguyenc.dynamicprogramming;

import junit.framework.TestCase;

public class ZeroOneKnapsackTest extends TestCase {

    public void testVarietyInputs() {
        assertEquals(9, ZeroOneKnapsack.knapsack(new int[][]{{1, 1}, {4, 5}, {3, 4}, {5, 7}}, 7));
        assertEquals(220, ZeroOneKnapsack.knapsack(new int[][]{{10, 60}, {30, 120}, {20, 100}}, 50));
    }
}