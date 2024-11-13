package com.example.lab03.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task2 {
    private double start;
    private double finish;
    private double step;
    private List<Point> points;
}
