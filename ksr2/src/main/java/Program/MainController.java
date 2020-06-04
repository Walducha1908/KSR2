package Program;

import Program.Data.DataWriter;
import Program.FuzzyLib.Containers.LinguisticVariableContainer;
import Program.FuzzyLib.Containers.QuantifierContainer;
import Program.FuzzyLib.Logic.AndSummarizer;
import Program.FuzzyLib.Logic.LinguisticLabel;
import Program.FuzzyLib.Summaries.LinguisticSummary;
import Program.Model.Containers.ResultContainer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.*;


public class MainController implements Initializable {

    @FXML private ChoiceBox qualifier;
    @FXML private ChoiceBox summarizer1;
    @FXML private ChoiceBox summarizer2;
    @FXML private TextArea textOutput;
    @FXML private CheckBox isItComplex;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        textOutput.setWrapText(true);
        updateVariablesBoxes();
    }

    public void saveResultsButton() {
        // Save results
        DataWriter.saveResults();
        System.out.println("Results saved successfully");
    }

    public void clearTextField() {
        textOutput.clear();
    }

    public void useGenerateButton() throws IOException, ParseException {

        if(qualifier.getSelectionModel().isEmpty() || summarizer1.getSelectionModel().isEmpty()) {
            Alert errorAlert = new Alert(Alert.AlertType.WARNING);
            errorAlert.setHeaderText("Not enough data");
            errorAlert.setContentText("Please select both qualifier and summarizer");
            errorAlert.showAndWait();
        }else {

            String a = qualifier.getSelectionModel().getSelectedItem().toString();
            String[] data = a.split(" - ");

            String b = summarizer1.getSelectionModel().getSelectedItem().toString();
            String[] data1 = b.split(" - ");

            for (LinguisticLabel quantifier : QuantifierContainer.nonAbsoluteQuantifiersList) {
                LinguisticSummary.createLinguisticSentence(
                        quantifier,
                        LinguisticVariableContainer.linguisticVariables.get(data[1]),
                        LinguisticVariableContainer.linguisticVariables.get(data1[1]));
            }
            for (LinguisticLabel quantifier : QuantifierContainer.absoluteQuantifiersList) {
                LinguisticSummary.createLinguisticSentence(
                        quantifier,
                        LinguisticVariableContainer.linguisticVariables.get(data[1]),
                        LinguisticVariableContainer.linguisticVariables.get(data1[1]));
            }
            // We have all results in container, let's print only positive.
            textOutput.clear();
            System.out.println("\nTrue sentences: " + ResultContainer.getOnlyTrueInString());
            textOutput.setText(ResultContainer.getOnlyTrueInString());
        }
    }

    public void useGenerateComplexButton() throws IOException, ParseException {
        if(isItComplex.isSelected() == false){
            Alert errorAlert = new Alert(Alert.AlertType.INFORMATION);
            errorAlert.setHeaderText("Wrong selection");
            errorAlert.setContentText("You did not choose to use an And Summarizer");
            errorAlert.showAndWait();
        }else {
            if (qualifier.getSelectionModel().isEmpty() || summarizer1.getSelectionModel().isEmpty() || summarizer2.getSelectionModel().isEmpty()) {
                Alert errorAlert = new Alert(Alert.AlertType.WARNING);
                errorAlert.setHeaderText("Not enough data");
                errorAlert.setContentText("Please select qualifier and both summarizers");
                errorAlert.showAndWait();
            } else {
                if (isItComplex.isSelected()) {
                    String a = qualifier.getSelectionModel().getSelectedItem().toString();
                    String[] data = a.split(" - ");

                    String b = summarizer1.getSelectionModel().getSelectedItem().toString();
                    String[] data1 = b.split(" - ");

                    String c = summarizer2.getSelectionModel().getSelectedItem().toString();
                    String[] data2 = c.split(" - ");

                    AndSummarizer andSummarizer = new AndSummarizer(
                            LinguisticVariableContainer.linguisticVariables.get(data1[1]),
                            LinguisticVariableContainer.linguisticVariables.get(data2[1]));
                    for (LinguisticLabel quantifier : QuantifierContainer.nonAbsoluteQuantifiersList) {
                        LinguisticSummary.createLinguisticSentence(
                                quantifier,
                                LinguisticVariableContainer.linguisticVariables.get(data[1]),
                                andSummarizer);
                    }
                    for (LinguisticLabel quantifier : QuantifierContainer.absoluteQuantifiersList) {
                        LinguisticSummary.createLinguisticSentence(
                                quantifier,
                                LinguisticVariableContainer.linguisticVariables.get(data[1]),
                                andSummarizer);
                    }
                    // We have all results in container, let's print only positive.
                    textOutput.clear();
                    System.out.println("\nTrue sentences: " + ResultContainer.getOnlyTrue());
                    textOutput.setText(ResultContainer.getOnlyTrueInString());

                } else {
                    System.out.println("AND option was not selected");
                }
            }
        }
    }

    public void addNewVariableButton() {
        Parent root;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/scene.fxml"));
            root = (Parent) loader.load();
            SideController controller = loader.getController();
            controller.setParentController(this);
            Stage stage = new Stage();
            stage.setTitle("Adding custom variable");
            stage.setScene(new Scene(root, 350, 400));
            stage.setResizable(false);
            stage.show();
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    public void updateVariablesBoxes() {
        LinguisticVariableContainer.sortLinguisticVariables();

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
