package com.zelders.tci.week1;

import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleMathTest {
    @Test
    public void sumTest(){
        assertEquals(2,(new SimpleMath()).sum(1,1),0);
    }
    @Test
    public void divideTest(){
        assertEquals(2, (new SimpleMath()).divide(4,2),0);
    }
    @Test
    public void moduloTest(){
        assertEquals(0, (new SimpleMath()).modulo(4,2),0);
    }
    @Test
    public void powerTest(){
        assertEquals(16, (new SimpleMath()).power(4,2),0);
    }
}