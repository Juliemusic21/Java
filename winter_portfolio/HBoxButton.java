/*
Julie Sakai
CSD-405
Module 7 Assignment
11/23/24
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxButton extends Application {
    @Override
    public void start(Stage stage) {
        //Create a new HBox with 10 horizontal spacing
        HBox hbox = new HBox(10);
        
        //Create two buttons for Create a new account or Login
        Button button1 = new Button("Create a new account");
        Button button2 = new Button("Login");
        
        //Adding buttons to the HBox
        hbox.getChildren().addAll(button1, button2);
        
        //Create scene with HBox
        Scene scene = new Scene(hbox, 200, 100);
        
        //Set the stage with scene
        stage.setTitle("Sakai Shopping Website");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
