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

    public static void simpleLinguisticSentence(LinguisticVariable quantifier, LinguisticVariable qualifier, LinguisticVariable summarizer) {
        double degreeOfTruth;
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
        sentence = (SentenceMaker.makeSentence(quantifier, qualifier, summarizer));

        ResultContainer.addResult(new Result(sentence, degreeOfTruth, records.size()));

        if (Settings.displayAll) {
            System.out.print(ResultContainer.results.getLast());
        }
    }
}
