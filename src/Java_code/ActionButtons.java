import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class ActionButtons {
    //This method opens a new window with the user's name as they sign up
    public static void openNewWindow(String userName) {
        Stage stage2 = new Stage();
        stage2.setTitle("Welcome, " + userName);
        
        // Create a new GridPane for the second window
        GridPane gridPane2 = new GridPane();
        gridPane2.setPadding(new Insets(10, 10, 10, 10));
        gridPane2.setVgap(8);
        gridPane2.setHgap(10);

        // Add a label to display the user's name
        Label welcomeLabel = new Label("Welcome, " + userName);
        gridPane2.add(welcomeLabel, 0, 0);

        Scene scene2 = new Scene(gridPane2, 1000, 1000);
        stage2.setScene(scene2);
        stage2.show();
    }
}
