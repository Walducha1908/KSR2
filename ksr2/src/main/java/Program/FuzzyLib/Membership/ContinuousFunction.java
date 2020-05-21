package Program.FuzzyLib.Membership;

import org.apache.poi.ss.formula.eval.NotImplementedException;

import java.util.LinkedList;

public class ContinuousFunction implements MembershipFunction {
    @Override
    public double getMembership(double x) {
        return 1.0;
    }

    @Override
    public LinkedList<Double> getParameters() {
        throw new NotImplementedException("Not implemented in constant function");
    }

    @Override
    public void setParameters(LinkedList<Double> parameters) {
        throw new NotImplementedException("Not implemented in constant function");
    }

    @Override
    public double cardinality() {
        return 1.0;
    }

    @Override
    public double support() {
        throw new NotImplementedException("Not implemented in constant function");
    }
}
