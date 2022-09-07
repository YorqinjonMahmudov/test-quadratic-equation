package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class QuadraticEquationZeroACasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();
    private final double a;
    private final double b;
    private final double c;

    public QuadraticEquationZeroACasesTesting(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Test(expected = IllegalArgumentException.class)
    public void testNoRootsCase() {
        String solve = quadraticEquation.solve(a, b, c);
        if (quadraticEquation.solve(a, b, c).equals("NaN"))
            throw new IllegalArgumentException();
        assertEquals("no roots", solve);
    }


    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][]{
                {0, 0, 1},
                {0, 0, 2},
                {0, 0, 3},
                {0, 0, 4},
        });
    }


}
