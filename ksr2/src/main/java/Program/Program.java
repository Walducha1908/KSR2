package Program;


import Program.Data.DataWriter;
import Program.FuzzyLib.Containers.LinguisticVariableContainer;
import Program.FuzzyLib.Containers.QuantifierContainer;
import Program.FuzzyLib.Logic.AndSummarizer;
import Program.FuzzyLib.Logic.LinguisticVariable;
import Program.FuzzyLib.Logic.OrSummarizer;
import Program.FuzzyLib.Summaries.LinguisticSummary;
import Program.Model.Containers.ResultContainer;
import Program.Model.Seasons;
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

//        // Common case.
//        for (LinguisticVariable quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("OvercastQ"),
//                    LinguisticVariableContainer.linguisticVariables.get("HighRH"));
//        }
//        for (LinguisticVariable quantifier: QuantifierContainer.absoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("OvercastQ"),
//                    LinguisticVariableContainer.linguisticVariables.get("HighRH"));
//        }

//        // Using and.
//        AndSummarizer andSummarizer = new AndSummarizer(
//                LinguisticVariableContainer.linguisticVariables.get("SunnyQ"),
//                LinguisticVariableContainer.linguisticVariables.get("LowRH"));
//        for (LinguisticVariable quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("GentleFG"),
//                    andSummarizer);
//        }
//        for (LinguisticVariable quantifier: QuantifierContainer.absoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("GentleFG"),
//                    andSummarizer);
//        }

        // Using or.
//        OrSummarizer orSummarizer = new OrSummarizer(
//                LinguisticVariableContainer.linguisticVariables.get("ColdTGS"),
//                LinguisticVariableContainer.linguisticVariables.get("HotTGS"));
//        for (LinguisticVariable quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("All"),
//                    orSummarizer);
//        }
//        for (LinguisticVariable quantifier: QuantifierContainer.absoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("All"),
//                    orSummarizer);
//        }

//         Using 'and' and 'or' both - hardcore case.
//        OrSummarizer orAndSummarizer = new OrSummarizer(
//                orSummarizer,
//                LinguisticVariableContainer.linguisticVariables.get("HotTGS"));
//        for (LinguisticVariable quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("All"),
//                    orAndSummarizer);
//        }
//        for (LinguisticVariable quantifier: QuantifierContainer.absoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("All"),
//                    orAndSummarizer);
//        }

        // Multi subject summary.
        for (LinguisticVariable quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
            LinguisticSummary.createMultiSubjectLinguisticSentence(
                    quantifier,
                    LinguisticVariableContainer.linguisticVariables.get("SunnyQ"),
                    Seasons.summer,
                    Seasons.winter);
        }


        // We have all results in container, let's print only positive.
        System.out.println("\nTrue sentences: " + ResultContainer.getOnlyTrue());

        // Save results
        DataWriter.saveResults();

        // Close app.
        Runtime.getRuntime().exit(0);
    }

}
