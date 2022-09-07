package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class QuadraticEquationTwoRootsCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    private double a;
    private double b;
    private double c;

    private String expected;

    public QuadraticEquationTwoRootsCasesTesting(double a, double b, double c, String expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Test
    public void testSingleRootsCase() {

        String solve = quadraticEquation.solve(a, b, c);
        String[] split = expected.split(" ");
        String[] strings = solve.split(" ");

        if (split[0].equals(strings[1]))
            expected = split[1]+" "+split[0];
        if (!solve.equals("no roots"))
            assertEquals(expected, solve);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][]{
                {1,5,4, "-1.0 -4.0"},
                {-1,5,-4, "1.0 4.0"},
                {1,5,6, "-2.0 -3.0"},
                {-1,5,-6, "2.0 3.0"},
        });
    }
}
