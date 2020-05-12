package Program.FuzzyLib.Logic;

import Program.Model.Record;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrSummarizer extends LinguisticVariable{
    private LinguisticVariable firstVariable;
    private LinguisticVariable secondVariable;

    public OrSummarizer(LinguisticVariable firstVariable, LinguisticVariable secondVariable) {
        super();
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
    }

    public double getMembershipWithRecord(Record record) {
        return Math.max(firstVariable.getMembershipWithRecord(record), secondVariable.getMembershipWithRecord(record));
    }

    public LinkedList<Double> support(LinkedList<Double> values) {
        List<Double> list = Stream.concat(firstVariable.support(values).stream(), secondVariable.support(values).stream())
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
        return " or ";
    }
}
