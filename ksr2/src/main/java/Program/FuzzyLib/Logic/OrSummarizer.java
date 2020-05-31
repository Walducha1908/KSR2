package Program.FuzzyLib.Logic;

import Program.Model.Record;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrSummarizer extends LinguisticLabel {
    private LinguisticLabel firstLabel;
    private LinguisticLabel secondLabel;

    public OrSummarizer(LinguisticLabel firstLabel, LinguisticLabel secondLabel) {
        super();
        this.firstLabel = firstLabel;
        this.secondLabel = secondLabel;

        if (firstLabel.getSeason() != null && secondLabel.getSeason() != null) {
            if (firstLabel.getSeason() != secondLabel.getSeason()) {
                throw new IllegalArgumentException("Cannot run sentence with different seasons!");
            }
        }

        if (firstLabel.getSeason() != null) {
            this.setSeason(firstLabel.getSeason());
        } else if (secondLabel.getSeason() != null) {
            this.setSeason(secondLabel.getSeason());
        } else {
            this.setSeason(null);
        }
    }

    public double getMembershipWithRecord(Record record) {
        return Math.max(firstLabel.getMembershipWithRecord(record), secondLabel.getMembershipWithRecord(record));
    }

    public LinkedList<Record> support(LinkedList<Record> values) {
        List<Record> list = Stream.concat(firstLabel.support(values).stream(),
                secondLabel.support(values).stream())
                .collect(Collectors.toList());
        LinkedList<Record> result = new LinkedList<Record>(list);
        return result;
    }

    public double degreeOfFuzziness(LinkedList<Record> values)
    {
        return firstLabel.degreeOfFuzziness(values) * secondLabel.degreeOfFuzziness(values);
    }

    public LinguisticLabel getFirstLabel() {
        return firstLabel;
    }

    public void setFirstLabel(LinguisticLabel firstLabel) {
        this.firstLabel = firstLabel;
    }

    public LinguisticLabel getSecondLabel() {
        return secondLabel;
    }

    public void setSecondLabel(LinguisticLabel secondLabel) {
        this.secondLabel = secondLabel;
    }

    @Override
    public String toString() {
        return firstLabel + " or " + secondLabel;
    }

    @Override
    public LinkedList<LinguisticLabel> getAllLinguisticVariables() {
        LinkedList<LinguisticLabel> variables = new LinkedList<>();
        variables.addAll(firstLabel.getAllLinguisticVariables());
        variables.addAll(secondLabel.getAllLinguisticVariables());
        return variables;
    }
}
