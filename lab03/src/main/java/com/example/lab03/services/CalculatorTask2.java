package com.example.lab03.services;

import com.example.lab03.data.Point;

import java.util.ArrayList;
import java.util.List;

public class CalculatorTask2 {
    public List<Point> calcPoints(double start, double finish, double step){
        List<Point> points = new ArrayList<>();
        int n = (int) Math.floor((finish-start)/step+2);
        for(int i=0; i<n-1; i++){
            double x = start+step*i;
            double y = function(x);
            points.add(new Point(x, y));
        }
        return points;
    }

    private double function(double x){
        return Math.log(Math.abs(2*x))/(Math.sin(x)-Math.PI);
    }
}
