package com.epam.rd.autotasks.paramcareless.singlerootonly;

import com.epam.rd.autotasks.QuadraticEquation;

class ParamCarelessSingleRootOnlyQuadraticEquation extends QuadraticEquation {
    @Override
    public String solve(final double a, final double b, final double c) {
        double discr = b * b - 4 * a * c;
        if (discr == 0)
            return String.valueOf((-b / (2 * a)));

        if (discr < 0)
            return "no roots";

        return (-b - discr) / (2 * a) +String.valueOf(((-b + discr ) / (2 * a)));


    }
}
