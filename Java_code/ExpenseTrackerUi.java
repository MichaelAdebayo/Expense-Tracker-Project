import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class ExpenseTrackerUi extends Application {

    
 public static void main(String[] args) {
        launch(args);
    }

@Override
public void start(Stage primaryStage) throws Exception {
    // TODO Auto-generated method stub
    
    primaryStage.setTitle("Expense Tracker");
    
    Label userIdLabel = new Label("User ID:");
    TextField userIdTextField = new TextField();

    Label userNameLabel = new Label("User Name:");
    TextField userNameTextField = new TextField();

    Button addUserButton = new Button("Sign Up");
    Button signIn = new Button("Sign In");

    StackPane stackPane = new StackPane();
    stackPane.getChildren().add(addUserButton);
    

    Scene scene = new Scene(stackPane, 300, 250);
    primaryStage.setScene(scene);
    primaryStage.show();


}



}
