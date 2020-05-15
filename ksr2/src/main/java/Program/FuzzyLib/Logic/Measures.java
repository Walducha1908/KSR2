package Program.FuzzyLib.Logic;

import Program.Model.Record;

import java.util.LinkedList;

public class Measures {

    public static double degreeOfTruth(LinguisticVariable quantifier, LinguisticVariable qualifier, LinguisticVariable summarizer, LinkedList<Record> records) {
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

    public static double DegreeOfImprecision(LinguisticVariable summarizer, LinkedList<Record> records) {
        double quotient = 1;
        LinkedList<LinguisticVariable> allLinguisticVariables = summarizer.getAllLinguisticVariables();
        for (LinguisticVariable variable : allLinguisticVariables) {
            quotient *= variable.degreeOfFuzziness(records);
        }
        return 1 - Math.pow(quotient, 1.0 / allLinguisticVariables.size());
    }

    public static double DegreeOfCovering(LinguisticVariable qualifier, LinguisticVariable summarizer, LinkedList<Record> records) {
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

    public static double DegreeOfAppropriateness(LinguisticVariable qualifier, LinguisticVariable summarizer, LinkedList<Record> records) {
        double quotient = 1;
        LinkedList<LinguisticVariable> allLinguisticVariables = summarizer.getAllLinguisticVariables();
        double t3 = DegreeOfCovering(qualifier, summarizer, records);
        for (LinguisticVariable variable : allLinguisticVariables) {
            double sum = 0;
            for (Record record : records){
                sum += variable.getMembershipWithRecord(record);
            }
            quotient *= sum / records.size();
        }
        return Math.abs(quotient - t3);
    }

    public static double LengthOfSummary(LinguisticVariable summarizer) {
        int summarizers = summarizer.getAllLinguisticVariables().size();
        return 2 * Math.pow(1.0 / 2.0, summarizers);
    }

    public static double DegreeOfQuantifierImprecision(LinguisticVariable quantifier, LinkedList<Record> records) {
        double result = quantifier.getMembershipFunction().support();
        if (quantifier.isAbsolute())
        {
            result /= (double) (records.size());
        }
        return 1 - result;
    }

    public static double DegreeOfQuantifierCardinality(LinguisticVariable quantifier, LinkedList<Record> records) {
        double result = quantifier.getMembershipFunction().cardinality();

        if (quantifier.isAbsolute())
        {
            result /= (double) (records.size());
        }
        return 1 - result;
    }

    public static double DegreeOfSummarizerCardinality(LinguisticVariable summarizer, LinkedList<Record> records) {
        double quotient = 1;
        LinkedList<LinguisticVariable> allLinguisticVariables = summarizer.getAllLinguisticVariables();
        for (LinguisticVariable variable : allLinguisticVariables) {
            quotient *= variable.cardinality() / records.size();
        }
        return 1 - Math.pow(quotient, 1.0 / allLinguisticVariables.size());
    }

    public static double DegreeOfQualifierImprecision(LinguisticVariable qualifier, LinkedList<Record> records) {
        return 1 - qualifier.degreeOfFuzziness(records);
    }

    public static double DegreeOfQualifierCardinality(LinguisticVariable qualifier, LinkedList<Record> records) {
        return 1 - (qualifier.cardinality() / records.size());
    }

    public static double LengthOfQualifier(LinguisticVariable qualifier) {
        int qualifiers = qualifier.getAllLinguisticVariables().size();
        return 2 * Math.pow(1.0 / 2.0, qualifiers);
    }
}
