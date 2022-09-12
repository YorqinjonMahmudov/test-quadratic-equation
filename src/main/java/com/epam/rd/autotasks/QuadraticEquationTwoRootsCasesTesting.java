package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class QuadraticEquationTwoRootsCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    private final double a;
    private final double b;
    private final double c;

    private final String expected;

    public QuadraticEquationTwoRootsCasesTesting(double a, double b, double c, String expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Test
    public void testTwoRootsCase() {

        String solve = quadraticEquation.solve(a, b, c);
        String[] expectedValue = expected.split(" ");
        String[] strings = solve.split(" ");

        if (!expectedValue[0].equals(strings[0])) {
            String  temp = expectedValue[0];
            expectedValue[0] = expectedValue[1];
            expectedValue[1] = temp;
        }
            assertArrayEquals(expectedValue, strings);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][]{
                {1, 5, 4, "-1.0 -4.0"},
                {-1, 5, -4, "1.0 4.0"},
                {1, 5, 6, "-2.0 -3.0"},
                {-1, 5, -6, "2.0 3.0"},
        });
    }
}
