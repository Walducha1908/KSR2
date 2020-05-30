package Program.FuzzyLib.Logic;

import Program.Model.Record;

import java.util.LinkedList;

public class Measures {

    public static double degreeOfTruth(LinguisticLabel quantifier, LinguisticLabel qualifier, LinguisticLabel summarizer, LinkedList<Record> records) {
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

    public static double degreeOfTruthMultiSubject(LinguisticLabel quantifier, LinguisticLabel summarizer, LinkedList<Record> records1, LinkedList<Record> records2) {
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

    public static double degreeOfImprecision(LinguisticLabel summarizer, LinkedList<Record> records) {
        double quotient = 1;
        LinkedList<LinguisticLabel> allLinguisticLabels = summarizer.getAllLinguisticVariables();
        for (LinguisticLabel variable : allLinguisticLabels) {
            quotient *= variable.degreeOfFuzziness(records);
        }
        return 1 - Math.pow(quotient, 1.0 / allLinguisticLabels.size());
    }

    public static double degreeOfCovering(LinguisticLabel qualifier, LinguisticLabel summarizer, LinkedList<Record> records) {
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

    public static double degreeOfAppropriateness(LinguisticLabel qualifier, LinguisticLabel summarizer, LinkedList<Record> records) {
        double quotient = 1;
        LinkedList<LinguisticLabel> allLinguisticLabels = summarizer.getAllLinguisticVariables();
        double t3 = degreeOfCovering(qualifier, summarizer, records);
        for (LinguisticLabel variable : allLinguisticLabels) {
            double sum = 0;
            for (Record record : records){
                sum += variable.getMembershipWithRecord(record);
            }
            quotient *= sum / records.size();
        }
        return Math.abs(quotient - t3);
    }

    public static double lengthOfSummary(LinguisticLabel summarizer) {
        int summarizers = summarizer.getAllLinguisticVariables().size();
        return 2 * Math.pow(1.0 / 2.0, summarizers);
    }

    public static double degreeOfQuantifierImprecision(LinguisticLabel quantifier, LinkedList<Record> records) {
        double result = quantifier.getMembershipFunction().support();
        if (quantifier.isAbsolute())
        {
            result /= (double) (records.size());
        }
        return 1 - result;
    }

    public static double degreeOfQuantifierCardinality(LinguisticLabel quantifier, LinkedList<Record> records) {
        double result = quantifier.getMembershipFunction().cardinality();

        if (quantifier.isAbsolute())
        {
            result /= (double) (records.size());
        }
        return 1 - result;
    }

    public static double degreeOfSummarizerCardinality(LinguisticLabel summarizer, LinkedList<Record> records) {
        double quotient = 1;
        LinkedList<LinguisticLabel> allLinguisticLabels = summarizer.getAllLinguisticVariables();
        for (LinguisticLabel variable : allLinguisticLabels) {
            quotient *= variable.cardinality() / records.size();
        }
        return 1 - Math.pow(quotient, 1.0 / allLinguisticLabels.size());
    }

    public static double degreeOfQualifierImprecision(LinguisticLabel qualifier, LinkedList<Record> records) {
        return 1 - qualifier.degreeOfFuzziness(records);
    }

    public static double degreeOfQualifierCardinality(LinguisticLabel qualifier, LinkedList<Record> records) {
        return 1 - (qualifier.cardinality() / records.size());
    }

    public static double lengthOfQualifier(LinguisticLabel qualifier) {
        int qualifiers = qualifier.getAllLinguisticVariables().size();
        return 2 * Math.pow(1.0 / 2.0, qualifiers);
    }
}
