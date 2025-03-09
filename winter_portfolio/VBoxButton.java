/*
Julie Sakai
CSD-405
Module 7 Assignment
11/23/24
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxButton extends Application {
    @Override
    public void start(Stage stage) {
        //Create a new VBox with 10 horizontal spacing
        VBox vbox = new VBox(10);
        
        //Create two buttons for Create a new account or Login
        Button button1 = new Button("Create a new account");
        Button button2 = new Button("Login");
        
        //Adding buttons to the VBox
        vbox.getChildren().addAll(button1, button2);
        
        //Create scene with VBox
        Scene scene = new Scene(vbox, 200, 100);
        
        //Set the stage with scene
        stage.setTitle("Sakai Shopping Website");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}