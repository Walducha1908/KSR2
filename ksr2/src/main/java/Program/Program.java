package Program;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.text.ParseException;

public class Program extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/program.fxml"));
        primaryStage.setTitle("Mati je kluski");
        primaryStage.setScene(new Scene(root, 800,600));
        primaryStage.show();
    }
    public static void main(String[] args) throws IOException, ParseException {
        launch(args);

        /*
        RecordContainer r = new RecordContainer(readRecords(args[0]));
        System.out.println("Started reading data...");

        LinkedList<Record> records = RecordContainer.getAllRecordList();
        System.out.println(records.size() + " records have been downloaded!");
        */
    }


}
