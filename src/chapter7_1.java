import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;


public class chapter7_1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start (Stage primaryStage) {
        VBox vbox = new VBox();
        Alert shownums = new Alert(AlertType.INFORMATION);
        Scene scene = new Scene(vbox);
        String [] usernums = new String[10];
        TextField [] text = new TextField[10];
        Button button = new Button("Submit");
        for (int i=0; i<text.length; i++) {
            text [i] = new TextField("Textfield " + (i+1));
            vbox.getChildren().add(text[i]);
        }
        vbox.getChildren().add(button);
        button.setOnAction(e-> {
            String nums = "Sorted Numbers: \n";
            for(int i=0; i<text.length; i++) {
                usernums[i] = text[i].getText();
                System.out.println(usernums[i]);
            }
            Sortarray.sort(usernums);
            for(int i=0; i<text.length; i++) {
                nums += usernums[i]+"\n";
            }
            shownums.setContentText(nums);
            shownums.showAndWait();
        });

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}