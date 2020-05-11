package Program.FuzzyLib.Membership;

import java.util.LinkedList;

public class TriangularFunction implements MembershipFunction {
    double a, b, c;

    public TriangularFunction(LinkedList<Double> parameters) {
        if (parameters.size() != 3) {
            throw new IllegalArgumentException("Invalid amount of arguments");
        }
        this.a = parameters.get(0);
        this.b = parameters.get(1);
        this.c = parameters.get(2);
    }

    @Override
    public double getMembership(double x) {
        if (x <= a)
            return 0.0;
        else if (a <= x && x < b)
            return (x - a) / (b - a);
        else if (b == x)
            return 1.0;
        else if (b < x && x <= c)
            return (c - x) / (c - b);
        else
            return 0.0;
    }

    @Override
    public LinkedList<Double> getParameters() {
        LinkedList<Double> list = new LinkedList<Double>();
        list.add(a);
        list.add(b);
        list.add(c);
        return list;
    }

    @Override
    public void setParameters(LinkedList<Double> parameters) {
        if (parameters.size() != 3) {
            throw new IllegalArgumentException("Invalid amount of arguments");
        }
        a = parameters.get(0);
        b = parameters.get(1);
        c = parameters.get(2);
    }

    @Override
    public double cardinality() {
        return (c - a) / 2;
    }

    @Override
    public double support() {
        return c - a;
    }
}
