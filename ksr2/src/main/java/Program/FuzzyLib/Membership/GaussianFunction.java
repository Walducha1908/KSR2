package Program.FuzzyLib.Membership;

import java.util.LinkedList;

public class GaussianFunction implements MembershipFunction {
    double mid, width;

    public GaussianFunction(LinkedList<Double> parameters) {
        if (parameters.size() != 2) {
            throw new IllegalArgumentException("Invalid amount of arguments");
        }
        this.mid = parameters.get(0);
        this.width = parameters.get(1);
    }

    @Override
    public double getMembership(double x) {
        return Math.exp(-1 * Math.pow((x - mid) / width, 2));
    }

    @Override
    public LinkedList<Double> getParameters() {
        LinkedList<Double> list = new LinkedList<Double>();
        list.add(mid);
        list.add(width);
        return list;
    }

    @Override
    public void setParameters(LinkedList<Double> parameters) {
        if (parameters.size() != 2) {
            throw new IllegalArgumentException("Invalid amount of arguments");
        }
        mid = parameters.get(0);
        width = parameters.get(1);
    }

    @Override
    public double cardinality() {
        return mid;
    }

    @Override
    public double support() {
        return 6 * width;
    }
}
