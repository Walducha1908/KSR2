package Program;


import Program.Data.DataWriter;
import Program.FuzzyLib.Containers.LinguisticVariableContainer;
import Program.FuzzyLib.Containers.QuantifierContainer;
import Program.FuzzyLib.Logic.LinguisticVariable;
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
        for (LinguisticVariable quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
            LinguisticSummary.createLinguisticSentence(
                    quantifier,
                    LinguisticVariableContainer.linguisticVariables.get("NoneRH"),
                    LinguisticVariableContainer.linguisticVariables.get("GentleFG"));
        }
        for (LinguisticVariable quantifier: QuantifierContainer.absoluteQuantifiersList) {
            LinguisticSummary.createLinguisticSentence(
                    quantifier,
                    LinguisticVariableContainer.linguisticVariables.get("NoneRH"),
                    LinguisticVariableContainer.linguisticVariables.get("GentleFG"));
        }

//        // Using and.
//        AndSummarizer andSummarizer = new AndSummarizer(
//                LinguisticVariableContainer.linguisticVariables.get("CloudyQ"),
//                LinguisticVariableContainer.linguisticVariables.get("OvercastQ"));
//        for (LinguisticVariable quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.simpleLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("DownpourRH"),
//                    andSummarizer);
//        }
//        for (LinguisticVariable quantifier: QuantifierContainer.absoluteQuantifiersList) {
//            LinguisticSummary.simpleLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("DownpourRH"),
//                    andSummarizer);
//        }

//        // Using or.
//        OrSummarizer orSummarizer = new OrSummarizer(
//                LinguisticVariableContainer.linguisticVariables.get("CloudyQ"),
//                LinguisticVariableContainer.linguisticVariables.get("OvercastQ"));
//        for (LinguisticVariable quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.simpleLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("DownpourRH"),
//                    orSummarizer);
//        }
//        for (LinguisticVariable quantifier: QuantifierContainer.absoluteQuantifiersList) {
//            LinguisticSummary.simpleLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("DownpourRH"),
//                    orSummarizer);
//        }

        // Using 'and' and 'or' both - hardcore case.
//        OrSummarizer orAndSummarizer = new OrSummarizer(
//                andSummarizer,
//                LinguisticVariableContainer.linguisticVariables.get("ColdTGSA"));
//        for (LinguisticVariable quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.simpleLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("DownpourRH"),
//                    orAndSummarizer);
//        }

        // We have all results in container, let's print only positive.
        System.out.println("\nTrue sentences: " + ResultContainer.getOnlyTrue());

        // Save results
        DataWriter.saveResults();

        // Close app.
        Runtime.getRuntime().exit(0);
    }

}
