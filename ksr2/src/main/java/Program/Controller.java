package Program;

import Program.FuzzyLib.Containers.LinguisticVariableContainer;
import Program.FuzzyLib.Logic.LinguisticVariable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML private Button button;
    @FXML private ChoiceBox qualifier;

    public void useButton() throws IOException, ParseException {
        Manager.readAllRecords();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        List<String> list = new ArrayList<String>();

        for(LinguisticVariable l : LinguisticVariableContainer.linguisticVariables.values()){
            list.add(l.toString());
        }

        ObservableList obList = FXCollections.observableList(list);
        qualifier.setItems(obList);

    }
}
