package com.example.module9;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class OnlineShopping extends Application {
    @Override
    public void start(Stage primaryStage) {
    //Create GUI component
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label addressLabel = new Label("Address:");
        TextField addressField = new TextField();

        Label paymentLabel = new Label("Payment Information:");
        TextField paymentField = new TextField();

        Button placeOrderButton = new Button("Place Order");
        //Disable the button
        placeOrderButton.setDisable(true);

        placeOrderButton.disableProperty().bind(
                Bindings.createBooleanBinding(() ->
                        nameField.getText().trim().isEmpty() ||
                        addressField.getText().trim().isEmpty() ||
                        paymentField.getText().trim().isEmpty(),
                        nameField.textProperty(),
                        addressField.textProperty(),
                        paymentField.textProperty()
                )
        );

        //Set up layout
        VBox vbox = new VBox(10, nameLabel, nameField, addressLabel, addressField, paymentLabel, paymentField, placeOrderButton);
        Scene scene = new Scene(vbox, 300, 250);

        primaryStage.setTitle("Online Shopping");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
