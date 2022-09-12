package com.epam.rd.autotasks.paramcareless.singlerootonly;

import com.epam.rd.autotasks.QuadraticEquation;
import com.epam.rd.autotasks.QuadraticEquationZeroACasesTesting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParamCarelessSingleRootOnlyQuadraticEquationZeroACasesTesting extends QuadraticEquationZeroACasesTesting {

    protected QuadraticEquation quadraticEquation;
    private final double a;
    private final double b;
    private final double c;


    public ParamCarelessSingleRootOnlyQuadraticEquationZeroACasesTesting(final double a, final double b, final double c) {
        super(a, b, c);
        quadraticEquation = new ParamCarelessSingleRootOnlyQuadraticEquation();

        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    @Test
    public void testZeroRootsCase() {
        String solve = quadraticEquation.solve(a, b, c);
            assertEquals("no roots", solve);
    }
}
