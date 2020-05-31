package Program.FuzzyLib.Logic;

import Program.Model.Record;

import java.util.LinkedList;

public class Measures {
    private LinguisticLabel quantifier;
    private LinguisticLabel qualifier;
    private LinguisticLabel summarizer;
    private LinkedList<Record> records;

    public Measures(LinguisticLabel quantifier, LinguisticLabel qualifier, LinguisticLabel summarizer, LinkedList<Record> records) {
        this.quantifier = quantifier;
        this.qualifier = qualifier;
        this.summarizer = summarizer;
        this.records = records;
    }

    public double degreeOfTruth() {
        double up = 0;
        double down = 0;
        for (Record record : records) {
            up += Math.min(qualifier.getMembershipWithRecord(record), summarizer.getMembershipWithRecord(record));
            down += qualifier.getMembershipWithRecord(record);
        }
        if (quantifier.isAbsolute()) {
            return quantifier.getMembership(up);
        }
        else {
            double x = up / down;
            return quantifier.getMembership(x);
        }
    }

    public double degreeOfTruthMultiSubject(LinkedList<Record> records1, LinkedList<Record> records2) {
        double result1 = 0;
        double result2 = 0;
        for (Record record : records1) {
            result1 += summarizer.getMembershipWithRecord(record);
        }
        result1 /= records1.size();
        for (Record record : records2) {
            result2 += summarizer.getMembershipWithRecord(record);
        }
        result2 /= records2.size();

        if (quantifier.isAbsolute()) {
            return -1;
        }
        else {
            double x = result1 / (result1 + result2);
            return quantifier.getMembership(x);
        }
    }

    public double degreeOfImprecision() {
        double quotient = 1;
        LinkedList<LinguisticLabel> allLinguisticLabels = summarizer.getAllLinguisticVariables();
        for (LinguisticLabel variable : allLinguisticLabels) {
            quotient *= variable.degreeOfFuzziness(records);
        }
        return 1 - Math.pow(quotient, 1.0 / allLinguisticLabels.size());
    }

    public double degreeOfCovering() {
        double t = 0;
        double h = 0;
        for (Record record : records) {
            if (qualifier.getMembershipWithRecord(record) > 0) {
                h++;
                if (summarizer.getMembershipWithRecord(record) > 0) {
                    t++;
                }
            }
        }
        return t / h;
    }

    public double degreeOfAppropriateness() {
        double quotient = 1;
        LinkedList<LinguisticLabel> allLinguisticLabels = summarizer.getAllLinguisticVariables();
        double t3 = degreeOfCovering();
        for (LinguisticLabel variable : allLinguisticLabels) {
            double sum = 0;
            for (Record record : records){
                sum += variable.getMembershipWithRecord(record);
            }
            quotient *= sum / records.size();
        }
        return Math.abs(quotient - t3);
    }

    public double lengthOfSummary() {
        int summarizers = summarizer.getAllLinguisticVariables().size();
        return 2 * Math.pow(1.0 / 2.0, summarizers);
    }

    public double degreeOfQuantifierImprecision() {
        double result = quantifier.getMembershipFunction().support();
        if (quantifier.isAbsolute())
        {
            result /= (double) (records.size());
        }
        return 1 - result;
    }

    public double degreeOfQuantifierCardinality() {
        double result = quantifier.getMembershipFunction().cardinality();

        if (quantifier.isAbsolute())
        {
            result /= (double) (records.size());
        }
        return 1 - result;
    }

    public double degreeOfSummarizerCardinality() {
        double quotient = 1;
        LinkedList<LinguisticLabel> allLinguisticLabels = summarizer.getAllLinguisticVariables();
        for (LinguisticLabel variable : allLinguisticLabels) {
            quotient *= variable.cardinality() / records.size();
        }
        return 1 - Math.pow(quotient, 1.0 / allLinguisticLabels.size());
    }

    public double degreeOfQualifierImprecision() {
        return 1 - qualifier.degreeOfFuzziness(records);
    }

    public double degreeOfQualifierCardinality() {
        return 1 - (qualifier.cardinality() / records.size());
    }

    public double lengthOfQualifier() {
        int qualifiers = qualifier.getAllLinguisticVariables().size();
        return 2 * Math.pow(1.0 / 2.0, qualifiers);
    }
}
