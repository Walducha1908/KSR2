package Program.FuzzyLib.Logic;

import Program.Model.Record;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AndSummarizer extends LinguisticLabel {
    private LinguisticLabel firstLabel;
    private LinguisticLabel secondLabel;

    public AndSummarizer(LinguisticLabel firstLabel, LinguisticLabel secondLabel) {
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

    @Override
    public double getMembershipWithRecord(Record record) {
        return Math.min(firstLabel.getMembershipWithRecord(record), secondLabel.getMembershipWithRecord(record));
    }

    public LinkedList<Record> support(LinkedList<Record> records) {
        List<Record> list = firstLabel.support(records).stream()
                .distinct()
                .filter(secondLabel.support(records)::contains)
                .collect(Collectors.toList());
        LinkedList<Record> result = new LinkedList<>(list);
        return result;
    }

    public double degreeOfFuzziness(LinkedList<Record> records) {
        return firstLabel.degreeOfFuzziness(records) * secondLabel.degreeOfFuzziness(records);
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
        return firstLabel + " and " + secondLabel;
    }

    @Override
    public LinkedList<LinguisticLabel> getAllLinguisticVariables() {
        LinkedList<LinguisticLabel> variables = new LinkedList<>();
        variables.addAll(firstLabel.getAllLinguisticVariables());
        variables.addAll(secondLabel.getAllLinguisticVariables());
        return variables;
    }
}
