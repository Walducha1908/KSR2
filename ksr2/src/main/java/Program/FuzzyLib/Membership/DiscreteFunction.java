package Program.FuzzyLib.Membership;

import org.apache.poi.ss.formula.eval.NotImplementedException;

import java.util.LinkedList;

public class DiscreteFunction implements MembershipFunction {
    LinkedList<Double> parameters;

    public DiscreteFunction(LinkedList<Double> parameters) {
        this.parameters = parameters;
    }

    @Override
    public double getMembership(double x) {
        return parameters.get((int)x);
    }

    @Override
    public LinkedList<Double> getParameters() {
        return parameters;
    }

    @Override
    public void setParameters(LinkedList<Double> parameters) {
        this.parameters = parameters;
    }

    @Override
    public double cardinality() {
        double sum = 0;
        for (int i = 0; i < parameters.size(); i++) {
            sum += parameters.get(i);
        }
        return sum;
    }

    @Override
    public double support() {
        throw new NotImplementedException("Not implemented in constant function");
    }
}
