package com.loiane.test.volume0;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.loiane.volume0.P10055;

/**
 * Test Case
 * Problem 10055 - Hashmat the Brave Warrior
 *
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class TestP10055 {

	@Test
    public void testProblem10055(){
 
        assertEquals(2, P10055.calcAbsDiff(10, 12));
        assertEquals(4, P10055.calcAbsDiff(10, 14));
        assertEquals(100, P10055.calcAbsDiff(100, 200));
    }
}
