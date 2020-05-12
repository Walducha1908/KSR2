package Program.Model;


import java.util.LinkedList;

public class RecordContainer {
    private static LinkedList<Record> allRecordList;
    private static LinkedList<Record> usedRecordList;

    public RecordContainer() {
        this.allRecordList = new LinkedList<Record>();
        this.usedRecordList = new LinkedList<Record>();
    }
    public RecordContainer(LinkedList list){
        this.allRecordList = list;
        this.usedRecordList = new LinkedList<Record>();
    }

    public static LinkedList<Record> getAllRecordList() {
        return allRecordList;
    }

    public static LinkedList<Record> getUsedRecordList() {
        return usedRecordList;
    }
}
