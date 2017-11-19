package com.zelders.tci.week1;

import java.util.Collections;
import java.util.List;

public class BasicStatistic {
    public double getMean(List<Double> uniqueParameter){
        double sum = 0;
        for (int i = 0; i < uniqueParameter.size(); i++) {
            sum += uniqueParameter.get(i);
        }
        return sum / uniqueParameter.size();
    }
    public double getMedian(List<Double> uniqueParameter){
        Collections.sort(uniqueParameter);
        int middle = uniqueParameter.size()/2;
        if (uniqueParameter.size()%2 == 1) {
            return uniqueParameter.get(middle);
        } else {
            return (uniqueParameter.get(middle-1) + uniqueParameter.get(middle) / 2.0);
        }
    }
    public double getStandardDeviation(List<Double> uniqueParameter){
        double mean = getMean(uniqueParameter);
        double temp = 0;
        for(double a :uniqueParameter)
            temp += (a-mean)*(a-mean);
        double variance =  temp/(uniqueParameter.size()-1);
        return Math.sqrt(variance);
    }
}
