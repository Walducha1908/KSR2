package Program;

import Program.Data.DataWriter;
import Program.FuzzyLib.Containers.LinguisticVariableContainer;
import Program.FuzzyLib.Containers.QuantifierContainer;
import Program.FuzzyLib.Logic.LinguisticLabel;
import Program.FuzzyLib.Logic.LinguisticLabel;
import Program.FuzzyLib.Summaries.LinguisticSummary;
import Program.Model.Containers.ResultContainer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.*;


public class Controller implements Initializable {

    @FXML private Button button;
    @FXML private ChoiceBox qualifier;
    @FXML private ChoiceBox summarizer1;
    @FXML private ChoiceBox summarizer2;
    @FXML private TextArea textOutput;


    public void useGenerateButton() throws IOException, ParseException {
        System.out.println("Generate button");

        String a = qualifier.getSelectionModel().getSelectedItem().toString();
        String[] data = a.split("=");
        System.out.println(data[0]);

        String b = summarizer1.getSelectionModel().getSelectedItem().toString();
        String[] data1 = b.split("=");
        System.out.println(data1[0]);

        for (LinguisticLabel quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
            LinguisticSummary.createLinguisticSentence(
                    quantifier,
                    LinguisticVariableContainer.linguisticVariables.get(data[0]),
                    LinguisticVariableContainer.linguisticVariables.get(data1[0]));
        }
        for (LinguisticLabel quantifier: QuantifierContainer.absoluteQuantifiersList) {
            LinguisticSummary.createLinguisticSentence(
                    quantifier,
                    LinguisticVariableContainer.linguisticVariables.get(data[0]),
                    LinguisticVariableContainer.linguisticVariables.get(data1[0]));
        }
        // We have all results in container, let's print only positive.
        textOutput.clear();
        System.out.println("\nTrue sentences: " + ResultContainer.getOnlyTrue());
        textOutput.setText("\nTrue sentences: " + ResultContainer.getOnlyTrue());

        // Save results
        DataWriter.saveResults();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        textOutput.setWrapText(true);
        List<String> list = new ArrayList<String>();

        for(Map.Entry<String, LinguisticLabel> entry : LinguisticVariableContainer.linguisticVariables.entrySet()){
            list.add(entry.toString());
        }

        ObservableList obList = FXCollections.observableList(list);
        qualifier.setItems(obList);
        summarizer1.setItems(obList);
        summarizer2.setItems(obList);

    }
}
