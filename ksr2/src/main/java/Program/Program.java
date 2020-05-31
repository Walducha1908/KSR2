package Program;


import Program.Data.DataWriter;
import Program.FuzzyLib.Containers.LinguisticVariableContainer;
import Program.FuzzyLib.Containers.QuantifierContainer;
import Program.FuzzyLib.Logic.AndSummarizer;
import Program.FuzzyLib.Logic.LinguisticLabel;
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

        // Common case.
//        for (LinguisticLabel quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("SunnyQ"),
//                    LinguisticVariableContainer.linguisticVariables.get("ColdTGS"));
//        }
//        for (LinguisticLabel quantifier: QuantifierContainer.absoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("SunnyQ"),
//                    LinguisticVariableContainer.linguisticVariables.get("ColdTGS"));
//        }
//
//        for (LinguisticLabel quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("SunnyQ"),
//                    LinguisticVariableContainer.linguisticVariables.get("WarmTGS"));
//        }
//        for (LinguisticLabel quantifier: QuantifierContainer.absoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("SunnyQ"),
//                    LinguisticVariableContainer.linguisticVariables.get("WarmTGS"));
//        }
//
//        for (LinguisticLabel quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("SunnyQ"),
//                    LinguisticVariableContainer.linguisticVariables.get("HotTGS"));
//        }
//        for (LinguisticLabel quantifier: QuantifierContainer.absoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("SunnyQ"),
//                    LinguisticVariableContainer.linguisticVariables.get("HotTGS"));
//        }

//        for (LinguisticLabel quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("All"),
//                    LinguisticVariableContainer.linguisticVariables.get("DownpourRH"));
//        }
//        for (LinguisticLabel quantifier: QuantifierContainer.absoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("All"),
//                    LinguisticVariableContainer.linguisticVariables.get("DownpourRH"));
//        }
//
//        for (LinguisticLabel quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("All"),
//                    LinguisticVariableContainer.linguisticVariables.get("SunnyQ"));
//        }
//        for (LinguisticLabel quantifier: QuantifierContainer.absoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("All"),
//                    LinguisticVariableContainer.linguisticVariables.get("SunnyQ"));
//        }

//        for (LinguisticLabel quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("All"),
//                    LinguisticVariableContainer.linguisticVariables.get("CloudyQ"));
//        }
//        for (LinguisticLabel quantifier: QuantifierContainer.absoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("All"),
//                    LinguisticVariableContainer.linguisticVariables.get("CloudyQ"));
//        }
//
//        for (LinguisticLabel quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("All"),
//                    LinguisticVariableContainer.linguisticVariables.get("OvercastQ"));
//        }
//        for (LinguisticLabel quantifier: QuantifierContainer.absoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("All"),
//                    LinguisticVariableContainer.linguisticVariables.get("OvercastQ"));
//        }


//        for (LinguisticLabel quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("SunnyQ"),
//                    LinguisticVariableContainer.linguisticVariables.get("LowRH"));
//        }
//        for (LinguisticLabel quantifier: QuantifierContainer.absoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("SunnyQ"),
//                    LinguisticVariableContainer.linguisticVariables.get("LowRH"));
//        }
//        for (LinguisticLabel quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("OvercastQ"),
//                    LinguisticVariableContainer.linguisticVariables.get("DownpourRH"));
//        }
//        for (LinguisticLabel quantifier: QuantifierContainer.absoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("OvercastQ"),
//                    LinguisticVariableContainer.linguisticVariables.get("DownpourRH"));
//        }
//        for (LinguisticLabel quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("OvercastQ"),
//                    LinguisticVariableContainer.linguisticVariables.get("HighRH"));
//        }
//        for (LinguisticLabel quantifier: QuantifierContainer.absoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("OvercastQ"),
//                    LinguisticVariableContainer.linguisticVariables.get("HighRH"));
//        }
//
        // Using and.
        AndSummarizer andSummarizer = new AndSummarizer(
                LinguisticVariableContainer.linguisticVariables.get("SunnyQ"),
                LinguisticVariableContainer.linguisticVariables.get("GentleFG"));
        for (LinguisticLabel quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
            LinguisticSummary.createLinguisticSentence(
                    quantifier,
                    LinguisticVariableContainer.linguisticVariables.get("ColdTGS"),
                    andSummarizer);
        }
        for (LinguisticLabel quantifier: QuantifierContainer.absoluteQuantifiersList) {
            LinguisticSummary.createLinguisticSentence(
                    quantifier,
                    LinguisticVariableContainer.linguisticVariables.get("ColdTGS"),
                    andSummarizer);
        }
//        andSummarizer = new AndSummarizer(
//                LinguisticVariableContainer.linguisticVariables.get("WarmTGS"),
//                LinguisticVariableContainer.linguisticVariables.get("ModerateFG"));
//        for (LinguisticLabel quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("SunnyQ"),
//                    andSummarizer);
//        }
//        for (LinguisticLabel quantifier: QuantifierContainer.absoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("SunnyQ"),
//                    andSummarizer);
//        }

//        andSummarizer = new AndSummarizer(
//                LinguisticVariableContainer.linguisticVariables.get("SunnyQ"),
//                LinguisticVariableContainer.linguisticVariables.get("HotTGS"));
//        for (LinguisticLabel quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("ModerateFG"),
//                    andSummarizer);
//        }
//        for (LinguisticLabel quantifier: QuantifierContainer.absoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("ModerateFG"),
//                    andSummarizer);
//        }
//
//        andSummarizer = new AndSummarizer(
//                LinguisticVariableContainer.linguisticVariables.get("SunnyQ"),
//                LinguisticVariableContainer.linguisticVariables.get("HotTGS"));
//        for (LinguisticLabel quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("StrongFG"),
//                    andSummarizer);
//        }
//        for (LinguisticLabel quantifier: QuantifierContainer.absoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("StrongFG"),
//                    andSummarizer);
//        }
//
//
//        andSummarizer = new AndSummarizer(
//                LinguisticVariableContainer.linguisticVariables.get("GentleFG"),
//                LinguisticVariableContainer.linguisticVariables.get("WarmTGS"));
//        for (LinguisticLabel quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("SunnyQ"),
//                    andSummarizer);
//        }
//        for (LinguisticLabel quantifier: QuantifierContainer.absoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("SunnyQ"),
//                    andSummarizer);
//        }
//
//        andSummarizer = new AndSummarizer(
//                LinguisticVariableContainer.linguisticVariables.get("GentleFG"),
//                LinguisticVariableContainer.linguisticVariables.get("HotTGS"));
//        for (LinguisticLabel quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("SunnyQ"),
//                    andSummarizer);
//        }
//        for (LinguisticLabel quantifier: QuantifierContainer.absoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("SunnyQ"),
//                    andSummarizer);
//        }
//
//        // Using or.
//        OrSummarizer orSummarizer = new OrSummarizer(
//                LinguisticVariableContainer.linguisticVariables.get("ColdTGS"),
//                LinguisticVariableContainer.linguisticVariables.get("HotTGS"));
//        for (LinguisticLabel quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("All"),
//                    orSummarizer);
//        }
//        for (LinguisticLabel quantifier: QuantifierContainer.absoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("All"),
//                    orSummarizer);
//        }
//
//        //Using 'and' and 'or' both - hardcore case.
//        OrSummarizer orAndSummarizer = new OrSummarizer(
//                orSummarizer,
//                LinguisticVariableContainer.linguisticVariables.get("HotTGS"));
//        for (LinguisticLabel quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("All"),
//                    orAndSummarizer);
//        }
//        for (LinguisticLabel quantifier: QuantifierContainer.absoluteQuantifiersList) {
//            LinguisticSummary.createLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("All"),
//                    orAndSummarizer);
//        }
//
        // Multi subject summary.
//        for (LinguisticLabel quantifier: QuantifierContainer.nonAbsoluteQuantifiersList) {
//            LinguisticSummary.createMultiSubjectLinguisticSentence(
//                    quantifier,
//                    LinguisticVariableContainer.linguisticVariables.get("SunnyQ"),
//                    Seasons.summer,
//                    Seasons.winter);
//        }


        // We have all results in container, let's print only positive.
        System.out.println("\nTrue sentences: " + ResultContainer.getOnlyTrue());

        // Save results
        DataWriter.saveResults();

        // Close app.
        Runtime.getRuntime().exit(0);
    }

}
