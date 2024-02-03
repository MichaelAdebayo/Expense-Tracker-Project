import org.w3c.dom.events.Event;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

    Button signUp = new Button("Sign Up");
    Button signIn = new Button("Sign In");

    //StackPane stackPane = new StackPane();
   //stackPane.getChildren().add(signUp);
    
      GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(8);
        gridPane.setHgap(10);

        // Add components to the layout
        gridPane.add(userIdLabel, 0, 0);
        gridPane.add(userIdTextField, 1, 0);
        gridPane.add(userNameLabel, 0, 1);
        gridPane.add(userNameTextField, 1, 1);
        gridPane.add(signUp, 1, 2);
        gridPane.add(signIn, 0, 2);

signUp.setOnAction( e -> {
    System.out.println("Sign Up Clicked");
    System.out.println("User ID: " + userIdTextField.getText());
    System.out.println("User Name: " + userNameTextField.getText());
    DatabaseConnection.insertUser(Integer.parseInt(userIdTextField.getText()), userNameTextField.getText());
    ActionButtons.openNewWindow(userNameTextField.getText());
    primaryStage.close();
  
});
    
    Scene scene = new Scene(gridPane, 300, 250);
    primaryStage.setScene(scene);
    primaryStage.show();

}

  

   

}
