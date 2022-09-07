package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class QuadraticEquationSingleRootCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();


    private double a;
    private double b;
    private double c;

    private double expected;

    public QuadraticEquationSingleRootCasesTesting(double a, double b, double c, double expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Test
    public void testSingleRootsCase() {
        if (!quadraticEquation.solve(a, b, c).equals("no roots") && !quadraticEquation.solve(a, b, c).contains(" "))
            assertEquals(expected, Double.parseDouble(quadraticEquation.solve(a, b, c)), 0.00001);


    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][]{
                {1, 2, 1, -1.0},
                {-1, 2, -1, 1.0},
                {1, 4, 4, -2.0},
                {-1, 4, -4, 2.0},
        });
    }

}