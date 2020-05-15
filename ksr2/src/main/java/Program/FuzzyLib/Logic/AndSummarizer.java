package Program.FuzzyLib.Logic;

import Program.Model.Record;

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

    @Override
    public double getMembershipWithRecord(Record record) {
        return Math.min(firstVariable.getMembershipWithRecord(record), secondVariable.getMembershipWithRecord(record));
    }

    public LinkedList<Record> support(LinkedList<Record> records) {
        List<Record> list = firstVariable.support(records).stream()
                .distinct()
                .filter(secondVariable.support(records)::contains)
                .collect(Collectors.toList());
        LinkedList<Record> result = new LinkedList<>(list);
        return result;
    }

    public double degreeOfFuzziness(LinkedList<Record> records) {
        return firstVariable.degreeOfFuzziness(records) * secondVariable.degreeOfFuzziness(records);
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
        return firstVariable + " and " + secondVariable;
    }

    @Override
    public LinkedList<LinguisticVariable> getAllLinguisticVariables() {
        LinkedList<LinguisticVariable> variables = new LinkedList<>();
        variables.addAll(firstVariable.getAllLinguisticVariables());
        variables.addAll(secondVariable.getAllLinguisticVariables());
        return variables;
    }
}
