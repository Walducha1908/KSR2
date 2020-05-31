package Program.Data;

import Program.Model.Containers.ResultContainer;
import Program.Model.Result;
import Program.Settings;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

public class DataWriter {
    public static void saveResults() {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Report");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
        LocalDateTime now = LocalDateTime.now();

        DecimalFormat df = new DecimalFormat("##.##");

        int rowCount = 0;
        int columnCount = 0;

        Row row = sheet.createRow(++rowCount);

        Cell cell = row.createCell(++columnCount);
        cell.setCellValue("Sentence");

        cell = row.createCell(++columnCount);
        cell.setCellValue("T");

        cell = row.createCell(++columnCount);
        cell.setCellValue("T1");

        cell = row.createCell(++columnCount);
        cell.setCellValue("T2");

        cell = row.createCell(++columnCount);
        cell.setCellValue("T3");

        cell = row.createCell(++columnCount);
        cell.setCellValue("T4");

        cell = row.createCell(++columnCount);
        cell.setCellValue("T5");

        cell = row.createCell(++columnCount);
        cell.setCellValue("T6");

        cell = row.createCell(++columnCount);
        cell.setCellValue("T7");

        cell = row.createCell(++columnCount);
        cell.setCellValue("T8");

        cell = row.createCell(++columnCount);
        cell.setCellValue("T9");

        cell = row.createCell(++columnCount);
        cell.setCellValue("T10");

        cell = row.createCell(++columnCount);
        cell.setCellValue("T11");

        LinkedList<Result> results;
        if (Settings.saveOnlyTrueSentences) {
            results = ResultContainer.getOnlyTrue();
        } else {
            results = ResultContainer.results;
        }

        for (int i = 0; i < results.size(); i++) {

            row = sheet.createRow(++rowCount);
            columnCount = 0;

            // Sentence
            Cell valueCell = row.createCell(++columnCount);
            valueCell.setCellValue(results.get(i).getSentence());

            // Optimum
            valueCell = row.createCell(++columnCount);
            valueCell.setCellValue(results.get(i).getOptimumMeasure());

            // T1
            valueCell = row.createCell(++columnCount);
            valueCell.setCellValue(results.get(i).getDegreeOfTruth());

            // T2
            valueCell = row.createCell(++columnCount);
            valueCell.setCellValue(results.get(i).getDegreeOfImprecision());

            // T3
            valueCell = row.createCell(++columnCount);
            valueCell.setCellValue(results.get(i).getDegreeOfCovering());

            // T4
            valueCell = row.createCell(++columnCount);
            valueCell.setCellValue(results.get(i).getDegreeOfAppropriateness());

            // T5
            valueCell = row.createCell(++columnCount);
            valueCell.setCellValue(results.get(i).getLengthOfSummary());

            // T6
            valueCell = row.createCell(++columnCount);
            valueCell.setCellValue(results.get(i).getDegreeOfQuantifierImprecision());

            // T7
            valueCell = row.createCell(++columnCount);
            valueCell.setCellValue(results.get(i).getDegreeOfQuantifierCardinality());

            // T8
            valueCell = row.createCell(++columnCount);
            valueCell.setCellValue(results.get(i).getDegreeOfSummarizerCardinality());

            // T9
            valueCell = row.createCell(++columnCount);
            valueCell.setCellValue(results.get(i).getDegreeOfQualifierImprecision());

            // T10
            valueCell = row.createCell(++columnCount);
            valueCell.setCellValue(results.get(i).getDegreeOfQualifierCardinality());

            // T11
            valueCell = row.createCell(++columnCount);
            valueCell.setCellValue(results.get(i).getLengthOfQualifier());
        }

        sheet.autoSizeColumn(1);
        sheet.autoSizeColumn(2);

        try (FileOutputStream outputStream = new FileOutputStream(
            Settings.pathToReports +
                    "KSR2_Report_" +
                    dtf.format(now) +
                    ".xlsx")) {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
