package com.epam.rd.autotasks.paramcareful.tworootsreversed;

import com.epam.rd.autotasks.QuadraticEquation;
import com.epam.rd.autotasks.QuadraticEquationNoRootsCasesTesting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParamCarefulTwoRootsReversedOrderQuadraticEquationNoRootsCasesTesting extends QuadraticEquationNoRootsCasesTesting {


    protected QuadraticEquation quadraticEquation;

    private final double a;
    private final double b;
    private final double c;


    @Test
    public void testNoRootsCase() {
        String solve = quadraticEquation.solve(a, b, c);
//        if (!solve.contains("NaN"))
            assertEquals("no roots", solve);
    }



    public ParamCarefulTwoRootsReversedOrderQuadraticEquationNoRootsCasesTesting(final double a, final double b, final double c) {
        super(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
        quadraticEquation = new ParamCarefulTwoRootsReversedOrderQuadraticEquation();
    }
}
