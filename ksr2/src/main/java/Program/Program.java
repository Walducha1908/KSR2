package Program;


import Program.FuzzyLib.Containers.LinguisticVariableContainer;
import Program.FuzzyLib.Containers.QuantifierContainer;
import Program.FuzzyLib.Logic.AndSummarizer;
import Program.FuzzyLib.Logic.LinguisticVariable;
import Program.FuzzyLib.Logic.OrSummarizer;
import Program.FuzzyLib.Summaries.LinguisticSummary;
import Program.Model.Containers.ResultContainer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.text.ParseException;

public class Program extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/program.fxml"));
            primaryStage.setTitle("Mati je kluski");
            primaryStage.setScene(new Scene(root, 800, 600));
            primaryStage.show();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) throws IOException, ParseException {
        Manager.readAllRecords();
        Manager.prepareLinguisticVariables();
        Manager.prepareQuantifiers();
//        launch(args);

        // Common case.
        System.out.println("");
        for (LinguisticVariable quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
            LinguisticSummary.simpleLinguisticSentence(
                    quantifier,
                    LinguisticVariableContainer.linguisticVariables.get("GentleFG"),
                    LinguisticVariableContainer.linguisticVariables.get("SunnyQ"));
        }
        for (LinguisticVariable quantifier: QuantifierContainer.absoluteQuantifiersList) {
            LinguisticSummary.simpleLinguisticSentence(
                    quantifier,
                    LinguisticVariableContainer.linguisticVariables.get("WarmTGS"),
                    LinguisticVariableContainer.linguisticVariables.get("SunnyQ"));
        }

        // Using and.
        System.out.println("");
        AndSummarizer andSummarizer = new AndSummarizer(
                LinguisticVariableContainer.linguisticVariables.get("SunnyQ"),
                LinguisticVariableContainer.linguisticVariables.get("ModerateFG"));
        for (LinguisticVariable quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
            LinguisticSummary.simpleLinguisticSentence(
                    quantifier,
                    LinguisticVariableContainer.linguisticVariables.get("WarmTGS"),
                    andSummarizer);
        }
        for (LinguisticVariable quantifier: QuantifierContainer.absoluteQuantifiersList) {
            LinguisticSummary.simpleLinguisticSentence(
                    quantifier,
                    LinguisticVariableContainer.linguisticVariables.get("WarmTGS"),
                    andSummarizer);
        }

        // Using or.
        System.out.println("");
        OrSummarizer orSummarizer = new OrSummarizer(
                LinguisticVariableContainer.linguisticVariables.get("SunnyQ"),
                LinguisticVariableContainer.linguisticVariables.get("ModerateFG"));
        for (LinguisticVariable quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
            LinguisticSummary.simpleLinguisticSentence(
                    quantifier,
                    LinguisticVariableContainer.linguisticVariables.get("WarmTGS"),
                    orSummarizer);
        }
        for (LinguisticVariable quantifier: QuantifierContainer.absoluteQuantifiersList) {
            LinguisticSummary.simpleLinguisticSentence(
                    quantifier,
                    LinguisticVariableContainer.linguisticVariables.get("WarmTGS"),
                    orSummarizer);
        }

        // We have all results in container, let's print only positive.
        System.out.println("\n\nTrue sentences: " + ResultContainer.getOnlyTrue());
    }

}
