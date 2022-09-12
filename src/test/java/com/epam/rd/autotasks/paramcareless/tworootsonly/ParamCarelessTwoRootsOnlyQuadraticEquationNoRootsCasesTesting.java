package com.epam.rd.autotasks.paramcareless.tworootsonly;

import com.epam.rd.autotasks.QuadraticEquation;
import com.epam.rd.autotasks.QuadraticEquationNoRootsCasesTesting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParamCarelessTwoRootsOnlyQuadraticEquationNoRootsCasesTesting extends QuadraticEquationNoRootsCasesTesting {


    protected QuadraticEquation quadraticEquation;

    private final double a;
    private final double b;
    private final double c;

    public ParamCarelessTwoRootsOnlyQuadraticEquationNoRootsCasesTesting(final double a, final double b, final double c) {
        super(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
        quadraticEquation = new ParamCarelessTwoRootsOnlyQuadraticEquation();
    }

    @Test
    public void testNoRootsCase() {
        String solve = quadraticEquation.solve(a, b, c);
            assertEquals("noroots", solve);
    }

}
