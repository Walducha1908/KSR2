package Program.FuzzyLib.Logic;

import Program.Model.Record;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrSummarizer extends LinguisticLabel {
    private LinguisticLabel firstVariable;
    private LinguisticLabel secondVariable;

    public OrSummarizer(LinguisticLabel firstVariable, LinguisticLabel secondVariable) {
        super();
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;

        if (firstVariable.getSeason() != null && secondVariable.getSeason() != null) {
            if (firstVariable.getSeason() != secondVariable.getSeason()) {
                throw new IllegalArgumentException("Cannot run sentence with different seasons!");
            }
        }

        if (firstVariable.getSeason() != null) {
            this.setSeason(firstVariable.getSeason());
        } else if (secondVariable.getSeason() != null) {
            this.setSeason(secondVariable.getSeason());
        } else {
            this.setSeason(null);
        }
    }

    public double getMembershipWithRecord(Record record) {
        return Math.max(firstVariable.getMembershipWithRecord(record), secondVariable.getMembershipWithRecord(record));
    }

    public LinkedList<Record> support(LinkedList<Record> values) {
        List<Record> list = Stream.concat(firstVariable.support(values).stream(),
                secondVariable.support(values).stream())
                .collect(Collectors.toList());
        LinkedList<Record> result = new LinkedList<Record>(list);
        return result;
    }

    public double degreeOfFuzziness(LinkedList<Record> values)
    {
        return firstVariable.degreeOfFuzziness(values) * secondVariable.degreeOfFuzziness(values);
    }

    public LinguisticLabel getFirstVariable() {
        return firstVariable;
    }

    public void setFirstVariable(LinguisticLabel firstVariable) {
        this.firstVariable = firstVariable;
    }

    public LinguisticLabel getSecondVariable() {
        return secondVariable;
    }

    public void setSecondVariable(LinguisticLabel secondVariable) {
        this.secondVariable = secondVariable;
    }

    @Override
    public String toString() {
        return firstVariable + " or " + secondVariable;
    }

    @Override
    public LinkedList<LinguisticLabel> getAllLinguisticVariables() {
        LinkedList<LinguisticLabel> variables = new LinkedList<>();
        variables.addAll(firstVariable.getAllLinguisticVariables());
        variables.addAll(secondVariable.getAllLinguisticVariables());
        return variables;
    }
}
