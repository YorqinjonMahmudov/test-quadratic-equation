package com.epam.rd.autotasks.paramcareless.tworootsonly;

import com.epam.rd.autotasks.QuadraticEquation;
import com.epam.rd.autotasks.QuadraticEquationSingleRootCasesTesting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParamCarelessTwoRootsOnlyQuadraticEquationSingleRootCasesTesting extends QuadraticEquationSingleRootCasesTesting {

    protected QuadraticEquation quadraticEquation = new QuadraticEquation();


    private double a;
    private double b;
    private double c;

    private double expected;


    @Test
    public void testSingleRootsCase() {

        try {

            if (!quadraticEquation.solve(a, b, c).equals("no roots") && !quadraticEquation.solve(a, b, c).contains(" "))
                if (quadraticEquation.solve(a, b, c).equals("no roots"))
                    throw new AssertionError();
            assertEquals(expected, Double.parseDouble(quadraticEquation.solve(a, b, c)), 0.00001);
        } catch (Exception e) {
            throw new AssertionError();
        }

    }

    public ParamCarelessTwoRootsOnlyQuadraticEquationSingleRootCasesTesting(final double a, final double b, final double c, final double expected) {
        super(a, b, c, expected);
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
        quadraticEquation = new ParamCarelessTwoRootsOnlyQuadraticEquation();
    }
}
