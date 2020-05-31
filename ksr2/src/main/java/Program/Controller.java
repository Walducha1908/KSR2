package Program;

import Program.Data.DataWriter;
import Program.FuzzyLib.Containers.LinguisticVariableContainer;
import Program.FuzzyLib.Containers.QuantifierContainer;
import Program.FuzzyLib.Logic.AndSummarizer;
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
    @FXML private CheckBox isItComplex;


    public void useGenerateButton() throws IOException, ParseException {

        String a = qualifier.getSelectionModel().getSelectedItem().toString();
        String[] data = a.split(" - ");

        String b = summarizer1.getSelectionModel().getSelectedItem().toString();
        String[] data1 = b.split(" - ");

        for (LinguisticLabel quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
            LinguisticSummary.createLinguisticSentence(
                    quantifier,
                    LinguisticVariableContainer.linguisticVariables.get(data[1]),
                    LinguisticVariableContainer.linguisticVariables.get(data1[1]));
        }
        for (LinguisticLabel quantifier: QuantifierContainer.absoluteQuantifiersList) {
            LinguisticSummary.createLinguisticSentence(
                    quantifier,
                    LinguisticVariableContainer.linguisticVariables.get(data[1]),
                    LinguisticVariableContainer.linguisticVariables.get(data1[1]));
        }
        // We have all results in container, let's print only positive.
        textOutput.clear();
        System.out.println("\nTrue sentences: " + ResultContainer.getOnlyTrue());
        textOutput.setText("\nTrue sentences: " + ResultContainer.getOnlyTrue());

        // Save results
        DataWriter.saveResults();
    }

    public void useGenerateComplexButton() throws IOException, ParseException {
        if(isItComplex.isSelected()){
            String a = qualifier.getSelectionModel().getSelectedItem().toString();
            String[] data = a.split(" - ");

            String b = summarizer1.getSelectionModel().getSelectedItem().toString();
            String[] data1 = b.split(" - ");

            String c = summarizer2.getSelectionModel().getSelectedItem().toString();
            String[] data2 = b.split(" - ");

            AndSummarizer andSummarizer = new AndSummarizer(
                LinguisticVariableContainer.linguisticVariables.get(data[1]),
                LinguisticVariableContainer.linguisticVariables.get(data1[1]));
            for (LinguisticLabel quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
                LinguisticSummary.createLinguisticSentence(
                        quantifier,
                        LinguisticVariableContainer.linguisticVariables.get(data2[1]),
                        andSummarizer);
            }
            for (LinguisticLabel quantifier: QuantifierContainer.absoluteQuantifiersList) {
                LinguisticSummary.createLinguisticSentence(
                        quantifier,
                        LinguisticVariableContainer.linguisticVariables.get(data2[1]),
                        andSummarizer);
        }
        // We have all results in container, let's print only positive.
        textOutput.clear();
        System.out.println("\nTrue sentences: " + ResultContainer.getOnlyTrue());
        textOutput.setText("\nTrue sentences: " + ResultContainer.getOnlyTrue());

        // Save results
        DataWriter.saveResults();

        }else{
            System.out.println("AND option was not selected");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        textOutput.setWrapText(true);
        List<String> list = new ArrayList<String>();

        for(Map.Entry<String, LinguisticLabel> entry : LinguisticVariableContainer.linguisticVariables.entrySet()){
            StringBuilder sb = new StringBuilder();
            sb.append(entry.getValue());
            sb.append(" - ");
            sb.append(entry.getKey());
            list.add(sb.toString());
        }

        ObservableList obList = FXCollections.observableList(list);
        qualifier.setItems(obList);
        summarizer1.setItems(obList);
        summarizer2.setItems(obList);

    }
}
