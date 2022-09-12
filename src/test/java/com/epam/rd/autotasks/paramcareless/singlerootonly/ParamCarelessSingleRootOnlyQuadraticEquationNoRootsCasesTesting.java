package com.epam.rd.autotasks.paramcareless.singlerootonly;

import com.epam.rd.autotasks.QuadraticEquation;
import com.epam.rd.autotasks.QuadraticEquationNoRootsCasesTesting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParamCarelessSingleRootOnlyQuadraticEquationNoRootsCasesTesting extends QuadraticEquationNoRootsCasesTesting {

    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    private final double a;
    private final double b;
    private final double c;


    public ParamCarelessSingleRootOnlyQuadraticEquationNoRootsCasesTesting(final double a, final double b, final double c) {
        super(a, b, c);
        quadraticEquation = new ParamCarelessSingleRootOnlyQuadraticEquation();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Test
    public void testNoRootsCase() {
        String solve = quadraticEquation.solve(a, b, c);
        if (!solve.contains("NaN"))
        assertEquals("noroots", solve);
    }
}
