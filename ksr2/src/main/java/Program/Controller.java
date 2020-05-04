package Program;

import Program.Model.Record;
import Program.Model.RecordContainer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedList;

import static Program.Data.DataReader.readRecords;


public class Controller {

    @FXML private Button button;
    @FXML private CheckBox chckbox;

    public void useButton() throws IOException, ParseException {
        RecordContainer r = new RecordContainer(readRecords("baza.xlsx"));
        System.out.println("Started reading data...");

        LinkedList<Record> records = r.getAllRecordList();
        System.out.println(records.size() + " records have been downloaded!");
    }
}
