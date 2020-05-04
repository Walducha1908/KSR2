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

        LinkedList<Record> temp = RecordContainer.getAllRecordList();

        System.out.println("0: " + temp.get(0).toString());
        System.out.println("1: " + temp.get(1).toString());
    }
}
