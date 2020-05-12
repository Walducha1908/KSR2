package Program;


import Program.FuzzyLib.Containers.QuantifierContainer;
import Program.FuzzyLib.Logic.LinguisticVariable;
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

        for (LinguisticVariable quantifier: QuantifierContainer.quantifiersList) {
            Manager.simpleLinguisticSentence(quantifier, "HotTGSA", "ModerateFG");
        }
    }


}
