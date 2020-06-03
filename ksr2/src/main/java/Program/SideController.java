package Program;

import Program.FuzzyLib.Containers.LinguisticVariableContainer;
import Program.FuzzyLib.Logic.LinguisticLabel;
import Program.FuzzyLib.Membership.GaussianFunction;
import Program.FuzzyLib.Membership.MembershipFunction;
import Program.FuzzyLib.Membership.TrapezoidFunction;
import Program.FuzzyLib.Membership.TriangularFunction;
import Program.FuzzyLib.Summaries.SentenceMaker;
import Program.Model.Columns;
import Program.Model.Seasons;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.*;

public class SideController implements Initializable {
    @FXML
    private ChoiceBox variable;
    @FXML
    private ChoiceBox function;
    @FXML
    private ChoiceBox season;
    @FXML
    private TextField name;
    @FXML
    private Spinner spinner1;
    @FXML
    private Spinner spinner2;
    @FXML
    private Spinner spinner3;
    @FXML
    private Spinner spinner4;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Variable choicebox
        List<String> variablesList = new ArrayList<String>();
        for(Columns c : Columns.values()){
            StringBuilder sb = new StringBuilder();
            sb.append(c.toString() + " - " +SentenceMaker.columnDictionary(c));
            variablesList.add(sb.toString());
        }
        ObservableList variablesObList = FXCollections.observableList(variablesList);
        variable.setItems(variablesObList);

        //Function choicebox
        List<String> functionList = new ArrayList<String>();
        functionList.add("Triangular Function");
        functionList.add("Trapezoid Function");
        functionList.add("Gaussian Function");
        ObservableList functionObList = FXCollections.observableList(functionList);
        function.setItems(functionObList);

        //Season choicebox
        List<String> seasonList = new ArrayList<String>();
        seasonList.add("summer");
        seasonList.add("winter");
        seasonList.add("spring_autumn");
        ObservableList seasonObList = FXCollections.observableList(seasonList);
        season.setItems(seasonObList);

        function.getSelectionModel().selectedItemProperty().addListener( (Observable, oldValue, newValue) -> {
            if(newValue.toString() == "Triangular Function"){
                spinner3.setDisable(false);
                spinner4.setDisable(true);
            }else if (newValue.toString() == "Gaussian Function"){
                spinner3.setDisable(true);
                spinner4.setDisable(true);
            }else{
                spinner3.setDisable(false);
                spinner4.setDisable(false);
            }
        }
        );

        variable.getSelectionModel().selectedItemProperty().addListener( (Observable, oldValue, newValue) -> {
            String temp = newValue.toString();
            String[] data = temp.split(" - ");
            System.out.println(data[0]);
            if (data[0] == "FG" || data[0] == "FHX" || data[0] == "FNX" || data[0] == "FXX" || data[0] == "Q" || data[0] =="RH") {
                season.setDisable(true);
            }else{
                season.setDisable(false);
            }
        });

    }

    public void createVariable() {
        String n = name.getText();
        Columns c;
        Seasons s;
        MembershipFunction MF;
        double first, second, third, fourth;

        first = Integer.valueOf(spinner1.getValue().toString());
        second =  Integer.valueOf(spinner2.getValue().toString());
        third =  Integer.valueOf(spinner3.getValue().toString());
        fourth =  Integer.valueOf(spinner4.getValue().toString());


        //getting name from gui
        String var = variable.getSelectionModel().getSelectedItem().toString();
        String[] data = var.split(" - ");
        c = Columns.valueOf(data[0]);

        //getting season from gui
        String seas = season.getSelectionModel().getSelectedItem().toString();
        s = Seasons.valueOf(seas);

        if(function.getSelectionModel().getSelectedItem().toString() == "Triangular Function"){
            spinner4.setEditable(false);
            first = Double.valueOf(spinner1.getValue().toString());
            second =  Double.valueOf(spinner2.getValue().toString());
            third =  Double.valueOf(spinner3.getValue().toString());
            if(c.toString() == "FG" || c.toString() == "FHX" || c.toString() == "FNX" || c.toString() == "FXX" || c.toString() == "Q" || c.toString() =="RH"){
                StringBuilder key = new StringBuilder();
                key.append(n);
                key.append(c.toString());
                LinguisticLabel a = new LinguisticLabel(
                        n,
                        c,
                        null,
                        new TriangularFunction(new LinkedList<Double>(Arrays.asList(first,second, third))));
                LinguisticVariableContainer.linguisticVariables.put(key.toString(), a);
                //System.out.println(a.toString());
            }else {
                StringBuilder key = new StringBuilder();
                key.append(n);
                key.append(c.toString());
                LinguisticLabel a = new LinguisticLabel(
                        n,
                        c,
                        s,
                        new TriangularFunction(new LinkedList<Double>(Arrays.asList(first,second, third))));
                LinguisticVariableContainer.linguisticVariables.put(key.toString(), a);

            }

        }else if(function.getSelectionModel().getSelectedItem().toString() == "Trapezoid Function"){
            first = Double.valueOf(spinner1.getValue().toString());
            second =  Double.valueOf(spinner2.getValue().toString());
            third =  Double.valueOf(spinner3.getValue().toString());
            fourth = Double.valueOf(spinner4.getValue().toString());
            if(c.toString() == "FG" || c.toString() == "FHX" || c.toString() == "FNX" || c.toString() == "FXX" || c.toString() == "Q" || c.toString() =="RH"){
                StringBuilder key = new StringBuilder();
                key.append(n);
                key.append(c.toString());
                LinguisticLabel a = new LinguisticLabel(
                        n,
                        c,
                        null,
                        new TrapezoidFunction(new LinkedList<Double>(Arrays.asList(first,second, third, fourth))));
                LinguisticVariableContainer.linguisticVariables.put(key.toString(), a);
                //System.out.println(a.toString());
            }else {
                StringBuilder key = new StringBuilder();
                key.append(n);
                key.append(c.toString());
                LinguisticLabel a = new LinguisticLabel(
                        n,
                        c,
                        s,
                        new TriangularFunction(new LinkedList<Double>(Arrays.asList(first,second, third, fourth))));
                LinguisticVariableContainer.linguisticVariables.put(key.toString(), a);

            }
        }else{
            spinner3.setEditable(false);
            spinner4.setEditable(false);
            first = Double.valueOf(spinner1.getValue().toString());
            second =  Double.valueOf(spinner2.getValue().toString());
            if(c.toString() == "FG" || c.toString() == "FHX" || c.toString() == "FNX" || c.toString() == "FXX" || c.toString() == "Q" || c.toString() =="RH"){
                StringBuilder key = new StringBuilder();
                key.append(n);
                key.append(c.toString());
                LinguisticLabel a = new LinguisticLabel(
                        n,
                        c,
                        null,
                        new GaussianFunction(new LinkedList<Double>(Arrays.asList(first,second))));
                LinguisticVariableContainer.linguisticVariables.put(key.toString(), a);
                //System.out.println(a.toString());
            }else {
                StringBuilder key = new StringBuilder();
                key.append(n);
                key.append(c.toString());
                LinguisticLabel a = new LinguisticLabel(
                        n,
                        c,
                        s,
                        new GaussianFunction(new LinkedList<Double>(Arrays.asList(first,second))));
                LinguisticVariableContainer.linguisticVariables.put(key.toString(), a);

            }
        }
    }
}
