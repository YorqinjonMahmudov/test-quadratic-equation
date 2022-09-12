package com.epam.rd.autotasks.paramcareful.tworootsreversed;

import com.epam.rd.autotasks.QuadraticEquation;
import com.epam.rd.autotasks.QuadraticEquationSingleRootCasesTesting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParamCarefulTwoRootsReversedOrderQuadraticEquationSingleRootCasesTesting extends QuadraticEquationSingleRootCasesTesting {

    protected QuadraticEquation quadraticEquation;


    private double a;
    private double b;
    private double c;

    private double expected;

    public ParamCarefulTwoRootsReversedOrderQuadraticEquationSingleRootCasesTesting(final double a, final double b, final double c, final double expected) {
        super(a, b, c, expected);
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
        quadraticEquation = new ParamCarefulTwoRootsReversedOrderQuadraticEquation();
    }

    @Test
    public void testSingleRootsCase() {

        String solve = quadraticEquation.solve(a, b, c);
        if (!quadraticEquation.solve(a, b, c).equals("no roots") || !quadraticEquation.solve(a, b, c).contains(" "))
            throw new AssertionError();
        if (solve.equals("no roots"))
            throw new AssertionError();
        assertEquals(expected, Double.parseDouble(solve), 0.00001);


    }

}
