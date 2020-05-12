package Program.FuzzyLib.Membership;

import Program.Model.Columns;
import Program.Model.Record;

import java.util.LinkedList;

public interface MembershipFunction {
    double getMembership(double x);
    LinkedList<Double> getParameters();
    void setParameters(LinkedList<Double> parameters);
    double cardinality();
    double support();
}
