package com.epam.rd.autotasks.paramcareful.tworootsreversed;

import com.epam.rd.autotasks.QuadraticEquation;
import com.epam.rd.autotasks.QuadraticEquationTwoRootsCasesTesting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParamCarefulTwoRootsReversedOrderQuadraticEquationTwoRootsCasesTesting extends QuadraticEquationTwoRootsCasesTesting {

    protected QuadraticEquation quadraticEquation;

    private double a;
    private double b;
    private double c;

    private String expected;

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

    public ParamCarefulTwoRootsReversedOrderQuadraticEquationTwoRootsCasesTesting(final double a, final double b, final double c, final String expected) {
        super(a, b, c, expected);
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
        quadraticEquation = new ParamCarefulTwoRootsReversedOrderQuadraticEquation();
    }
}
