package Program;

import Program.FuzzyLib.Containers.LinguisticVariableContainer;
import Program.FuzzyLib.Containers.QuantifierContainer;
import Program.Model.Record;
import Program.Model.Containers.RecordContainer;

import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedList;

import static Program.Data.DataReader.readRecords;

public class Manager {
    public static void prepareLinguisticVariables() {
        LinguisticVariableContainer.prepareLinguisticVariables();
        System.out.println(LinguisticVariableContainer.linguisticVariables.size() + " linguistic variables have been created!");
    }

    public static void prepareQuantifiers() {
        QuantifierContainer.prepareNonAbsoluteQuantifiers();
        System.out.println(QuantifierContainer.nonAbsoluteQuantifiersMap.size() + " non absolute quantifiers have been created!");

        QuantifierContainer.prepareAbsoluteQuantifiers();
        System.out.println(QuantifierContainer.absoluteQuantifiersList.size() + " absolute quantifiers have been created!");
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

        LinkedList<Record> records = r.getAllRecordsList();
        System.out.println(records.size() + " records have been downloaded!");
    }
}
