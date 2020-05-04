package Program.Data;


import Program.Model.Record;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class DataReader {

    public static LinkedList<Record> readRecords(String file) throws IOException, ParseException {
        FileInputStream fs = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fs);
        XSSFSheet sheet = wb.getSheetAt(0);
        LinkedList<Record> recordList = new LinkedList<>();

        Iterator<Row> rowIterator = sheet.iterator();
        rowIterator.next();
        while (rowIterator.hasNext()) {
            Row row = (XSSFRow) rowIterator.next();
            if(row.getCell(0) == null){
                break;
            }

            recordList.add(createRecord(row));
        }
        fs.close();
        return recordList;
    }

    private static Record createRecord (Row r) throws ParseException {

        double station;
        Date date;
        double FG;
        double FHX;
        double FHN;
        double FXX;
        double TG;
        double TN;
        double TX;
        double T10N;
        double Q;
        double RH;

        station = r.getCell(0).getNumericCellValue();
        date = parseDate(r.getCell(1).getStringCellValue());
        FG = r.getCell(2).getNumericCellValue();
        FHX = r.getCell(3).getNumericCellValue();
        FHN = r.getCell(4).getNumericCellValue();
        FXX = r.getCell(5).getNumericCellValue();
        TG = r.getCell(6).getNumericCellValue();
        TN = r.getCell(7).getNumericCellValue();
        TX = r.getCell(8).getNumericCellValue();
        T10N = r.getCell(9).getNumericCellValue();
        Q = r.getCell(10).getNumericCellValue();
        RH = r.getCell(11).getNumericCellValue();

        Record R = new Record(station, date, FG, FHX, FHN, FXX, TG, TN, TX, T10N, Q, RH);

        return R;

    }

    private static Date parseDate(String d) throws ParseException {
        String year = d.substring(0,4);
        String month = d.substring(4,6);
        String day = d.substring(6,8);

        StringBuilder str = new StringBuilder();
        str.append(year);
        str.append("-");
        str.append(month);
        str.append("-");
        str.append(day);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String convertedCurrentDate =sdf.format(sdf.parse(str.toString()));
        Date convertedDate = sdf.parse(convertedCurrentDate);

        return convertedDate;
    }
}

