package Program;

import Program.FuzzyLib.Containers.LinguisticVariableContainer;
import Program.FuzzyLib.Containers.QuantifierContainer;
import Program.FuzzyLib.Logic.LinguisticVariable;
import Program.FuzzyLib.Logic.Measures;
import Program.Helper.SentenceMaker;
import Program.Model.Record;
import Program.Model.RecordContainer;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.LinkedList;

import static Program.Data.DataReader.readRecords;

public class Manager {
    public static void prepareLinguisticVariables() {
        LinguisticVariableContainer.prepareLinguisticVariables();
        System.out.println(LinguisticVariableContainer.linguisticVariables.size() + " linguistic variables have been created!");
    }

    public static void prepareQuantifiers() {
        QuantifierContainer.prepareQuantifiers();
        System.out.println(QuantifierContainer.quantifiersMap.size() + " quantifiers have been created!");
    }

    public static void readAllRecords() {
        RecordContainer r = null;
        try {
            r = new RecordContainer(readRecords("baza.xlsx"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Started reading data...");

        LinkedList<Record> records = r.getAllRecordList();
        System.out.println(records.size() + " records have been downloaded!");
    }

    public static void simpleLinguisticSentence(LinguisticVariable quantifier, String qualifierName, String summarizerName) {
        double result;
        LinguisticVariable qualifier = LinguisticVariableContainer.linguisticVariables.get(qualifierName);
        LinguisticVariable summarizer = LinguisticVariableContainer.linguisticVariables.get(summarizerName);

        DecimalFormat df = new DecimalFormat("0.000");

        result = Measures.degreeOfTruth(quantifier, qualifier, summarizer, RecordContainer.getAllRecordList());
        System.out.println(SentenceMaker.makeSentence(quantifier, qualifier, summarizer) + " [T = " + df.format(result) + "]");
    }
}
