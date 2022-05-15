package com.csliao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void shouldAnswerWithTrue() {
        HelloWorld hw = new HelloWorld();
        assertEquals(hw.run(),"HelloWorld");
    }
}
