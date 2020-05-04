package Program;

import Program.Model.Record;
import Program.Model.RecordContainer;

import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedList;


import static Program.Data.DataReader.readRecords;

public class Program {

    public static void main(String[] args) throws IOException, ParseException {
        RecordContainer r = new RecordContainer(readRecords(args[0]));
        System.out.println("Started reading data...");

        LinkedList<Record> records = RecordContainer.getAllRecordList();
        System.out.println(records.size() + " records have been downloaded!");
    }
}
