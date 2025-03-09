package com.example.javafxtest1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class FoodOrderingJavaFX extends Application {
    @Override
    public void start(Stage primaryStage) {

        //Create a label
        Label label = new Label("Order your food:");

        //Create a button
        Button button = new Button("Order Food");

        //Add action event to the button
        button.setOnAction(e -> {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Order Confirmation");
            alert.setHeaderText(null);
            alert.setContentText("Your order has been placed!");
            alert.showAndWait();
        });

        //Create a layout and add components
        VBox root = new VBox(10, label, button);

        //Create a scene and add to stage
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Food Ordering System - JavaFX");
        primaryStage.setScene(scene);

        //Set the stage visibility
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

