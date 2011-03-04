package com.loiane.test.volume0;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.loiane.volume0.P10071;

/**
 * Test Case
 * Problem 10071 - Back to High School Physics
 *
 * @author Loiane Groner
 * http://loiane.com
 * http://loianegroner.com
 */
public class TestP10071 {

	@Test
    public void testProblem10071(){
 
        assertEquals(0, P10071.calcDistance(0, 0));
        assertEquals(120, P10071.calcDistance(5, 12));
    }
}
