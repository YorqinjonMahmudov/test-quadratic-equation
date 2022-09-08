package com.epam.rd.autotasks.paramcareful.incapable;

import com.epam.rd.autotasks.QuadraticEquation;
import com.epam.rd.autotasks.QuadraticEquationSingleRootCasesTesting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParamCarefulIncapableQuadraticEquationSingleRootCasesTesting extends QuadraticEquationSingleRootCasesTesting {

    protected QuadraticEquation quadraticEquation;


    private double a;
    private double b;
    private double c;

    private double expected;

    public ParamCarefulIncapableQuadraticEquationSingleRootCasesTesting(final double a, final double b, final double c, final double expected) {
        super(a, b, c, expected);
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
        quadraticEquation = new ParamCarefulIncapableQuadraticEquation();
    }
    @Test
    public void testSingleRootsCase() {
        String solve = quadraticEquation.solve(a, b, c);
        assertEquals(expected, Double.parseDouble(solve));

    }

}
