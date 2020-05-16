package Program.FuzzyLib.Summaries;

import Program.FuzzyLib.Logic.LinguisticVariable;
import Program.FuzzyLib.Logic.Measures;
import Program.Model.Containers.ResultContainer;
import Program.Model.Record;
import Program.Model.Containers.RecordContainer;
import Program.Model.Result;
import Program.Settings;

import java.text.DecimalFormat;
import java.util.LinkedList;

public class LinguisticSummary {

    public static void createLinguisticSentence(LinguisticVariable quantifier, LinguisticVariable qualifier, LinguisticVariable summarizer) {
        double degreeOfTruth = -1, degreeOfImprecision = -1, degreeOfCovering = -1, degreeOfAppropriateness = -1,
            lengthOfSummary = -1, degreeOfQuantifierImprecision = -1, degreeOfQuantifierCardinality = -1,
            degreeOfSummarizerCardinality = -1, degreeOfQualifierImprecision = -1, degreeOfQualifierCardinality = -1,
            lengthOfQualifier = -1;
        String sentence;

        LinkedList<Record> records = new LinkedList<>();
        DecimalFormat df = new DecimalFormat("0.000");

        if (summarizer.getSeason() != null && qualifier.getSeason() != null) {
            if (summarizer.getSeason() != qualifier.getSeason()) {
                throw new IllegalArgumentException("Cannot run sentence with different seasons!");
            }
        }

        if (summarizer.getSeason() != null) {
            records = RecordContainer.getAllRecordsFromSeasonList(summarizer.getSeason());
        } else if (qualifier.getSeason() != null) {
            records = RecordContainer.getAllRecordsFromSeasonList(qualifier.getSeason());
        } else {
            records = RecordContainer.getAllRecordsList();
        }

        degreeOfTruth = Measures.degreeOfTruth(quantifier, qualifier, summarizer, records);
        if (!Settings.countOnlyDegreeOfTruth) {
            degreeOfImprecision = Measures.degreeOfImprecision(summarizer, records);
            degreeOfCovering = Measures.degreeOfCovering(qualifier, summarizer, records);
            degreeOfAppropriateness = Measures.degreeOfAppropriateness(qualifier, summarizer, records);
            lengthOfSummary = Measures.lengthOfSummary(summarizer);
            degreeOfQuantifierImprecision = Measures.degreeOfQuantifierImprecision(quantifier, records);
            degreeOfQuantifierCardinality = Measures.degreeOfQuantifierCardinality(quantifier, records);
            degreeOfSummarizerCardinality = Measures.degreeOfSummarizerCardinality(summarizer, records);
            degreeOfQualifierImprecision = Measures.degreeOfQualifierImprecision(qualifier, records);
            degreeOfQualifierCardinality = Measures.degreeOfQualifierCardinality(qualifier, records);
            lengthOfQualifier = Measures.lengthOfQualifier(qualifier);
        }

        sentence = (SentenceMaker.makeSentence(quantifier, qualifier, summarizer));

        ResultContainer.addResult(new Result(sentence, records.size(), degreeOfTruth, degreeOfImprecision,
                degreeOfCovering, degreeOfAppropriateness, lengthOfSummary, degreeOfQuantifierImprecision,
                degreeOfQuantifierCardinality, degreeOfSummarizerCardinality, degreeOfQualifierImprecision,
                degreeOfQualifierCardinality, lengthOfQualifier));

        if (Settings.displayAll) {
            System.out.print(ResultContainer.results.getLast());
        }
    }
}
