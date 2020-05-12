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
}
