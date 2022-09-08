package com.epam.rd.autotasks.paramcareless.tworootsonly;

import com.epam.rd.autotasks.QuadraticEquation;
import com.epam.rd.autotasks.QuadraticEquationZeroACasesTesting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParamCarelessTwoRootsOnlyQuadraticEquationZeroACasesTesting extends QuadraticEquationZeroACasesTesting {

    protected QuadraticEquation quadraticEquation = new QuadraticEquation();
    private final double a;
    private final double b;
    private final double c;


    @Test
    public void testZeroRootsCase() {
       try {
           String solve = quadraticEquation.solve(a, b, c);
           assertEquals("no roots", solve);
       } catch (Exception e){
           throw new AssertionError();
       }
    }


    public ParamCarelessTwoRootsOnlyQuadraticEquationZeroACasesTesting(final double a, final double b, final double c) {
        super(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
        quadraticEquation = new ParamCarelessTwoRootsOnlyQuadraticEquation();
    }
}
