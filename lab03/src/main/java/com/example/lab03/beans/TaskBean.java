package com.example.lab03.beans;

import com.example.lab03.data.Task1;
import com.example.lab03.data.Task2;
import com.example.lab03.services.CalculatorTask1;
import com.example.lab03.services.CalculatorTask2;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Named
@SessionScoped
public class TaskBean implements Serializable {
    private Task1 task1 = new Task1();
    private Task2 task2 = new Task2();

    public String calculateFunction() {
        CalculatorTask1 ct1 = new CalculatorTask1();
        task1.setCountY(ct1.calculateChByCount(task1.getX(), task1.getN()));
        double[] tmp = ct1.calculateChByDelta(task1.getX(), task1.getDeltaY());
        task1.setDeltaY(tmp[0]);
        task1.setDeltaN(tmp[1]);
        task1.setTrueY(ct1.calculateTrue(task1.getX()));
        return "funcCalc.xhtml";
    }

    public String tabulateFunction() {
        CalculatorTask2 ct2 = new CalculatorTask2();
        task2.setPoints(ct2.calcPoints(task2.getStart(), task2.getFinish(), task2.getStep()));
        return "tab.xhtml";
    }
}
