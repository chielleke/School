package com.zelders.tci.week1;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BasicStatisticTest {
    @Test
    public void getStandardDeviationTest(){
        assertEquals(15.751507864328417, (new BasicStatistic()).getStandardDeviation(new ArrayList<Double>(Arrays.asList(3.2,23.1,34.3))),4);
    }
    @Test
    public void getMedianTest(){
        assertEquals(23.1,(new BasicStatistic()).getMedian(new ArrayList<Double>(Arrays.asList(3.2,23.1,34.3))),4 );
    }
    @Test
    public void getMean(){
        assertEquals(20.2, (new BasicStatistic()).getMean(new ArrayList<Double>(Arrays.asList(3.2,23.1,34.3))),4);
    }
}
