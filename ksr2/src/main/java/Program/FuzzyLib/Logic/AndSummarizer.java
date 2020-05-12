package Program.FuzzyLib.Logic;

import Program.FuzzyLib.Membership.MembershipFunction;
import Program.Model.Record;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AndSummarizer extends LinguisticVariable {
    private LinguisticVariable firstVariable;
    private LinguisticVariable secondVariable;

    public AndSummarizer(LinguisticVariable firstVariable, LinguisticVariable secondVariable) {
        super();
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
    }

    @Override
    public double getMembershipWithRecord(Record record) {
        return Math.min(firstVariable.getMembershipWithRecord(record), secondVariable.getMembershipWithRecord(record));
    }

    public LinkedList<Double> support(LinkedList<Double> values) {
        List<Double> list = firstVariable.support(values).stream()
                .distinct()
                .filter(secondVariable.support(values)::contains)
                .collect(Collectors.toList());
        LinkedList<Double> result = new LinkedList<Double>(list);
        return result;
    }

    public double degreeOfFuzziness(LinkedList<Double> values)
    {
        return firstVariable.degreeOfFuzziness(values) * secondVariable.degreeOfFuzziness(values);
    }

    public LinguisticVariable getFirstVariable() {
        return firstVariable;
    }

    public void setFirstVariable(LinguisticVariable firstVariable) {
        this.firstVariable = firstVariable;
    }

    public LinguisticVariable getSecondVariable() {
        return secondVariable;
    }

    public void setSecondVariable(LinguisticVariable secondVariable) {
        this.secondVariable = secondVariable;
    }

    @Override
    public String toString() {
        return " and ";
    }
}
