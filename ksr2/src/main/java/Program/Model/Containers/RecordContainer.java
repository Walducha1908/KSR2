package Program.Model.Containers;


import Program.Model.Record;
import Program.Model.Seasons;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class RecordContainer {
    private static LinkedList<Record> allRecordsList;

    public RecordContainer() {
        this.allRecordsList = new LinkedList<Record>();
    }
    public RecordContainer(LinkedList list){
        this.allRecordsList = list;
    }

    public static LinkedList<Record> getAllRecordsFromSeasonList(Seasons season) {
        LinkedList<Record> resultList = new LinkedList<>();

        for (Record record: allRecordsList) {
            LocalDate localDate = record.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int month = localDate.getMonthValue();
            int day = localDate.getDayOfMonth();
            if (season == Seasons.winter) {
                if ((month == 12 && day >= 22) || (month <= 2) || (month == 3 && day <= 20)) {
                    resultList.add(record);
                }
            } else if (season == Seasons.spring_autumn) {
                if ((month == 3 && day >= 21) ||
                        (month == 6 && day <= 21) ||
                        (month == 9 && day >= 23) ||
                        (month == 12 && day <= 21) ||
                        month == 4 || month == 5 ||
                        month == 10 || month == 11) {
                    resultList.add(record);
                }
            } else if (season == Seasons.summer) {
                if ((month == 6 && day >= 22) || month == 7 || month == 8 || (month == 9 && day <= 22) ) {
                    resultList.add(record);
                }
            }
        }

        return resultList;
    }

    public static LinkedList<Record> getAllRecordsList() {
        return allRecordsList;
    }
}
