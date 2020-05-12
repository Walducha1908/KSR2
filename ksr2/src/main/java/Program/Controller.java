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
    @FXML private CheckBox checkbox;

    public void useButton() throws IOException, ParseException {
        Manager.readAllRecords();
    }
}
