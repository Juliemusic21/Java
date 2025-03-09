/*
Julie Sakai
CSD 405
Module 11 Programming Assignment
12/14/24
 */

package com.example.module11;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

import java.util.Random;

public class DisplayShape extends Application {

    private Shape currentShape;
    private Color currentFill = null;

    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(20, 20, 20, 20));

        //Create shape object and set the size
        Circle circle = new Circle(100);
        Rectangle rectangle = new Rectangle(200, 100);
        Ellipse ellipse = new Ellipse(100, 50);

        //Create a toggleGroup
        ToggleGroup group = new ToggleGroup();
        //Define VBox to assign vertically
        VBox controlBox = new VBox(10);

        //Set radio buttons for each shape
        RadioButton circleButton = new RadioButton("Circle");
        RadioButton rectangleButton = new RadioButton("Rectangle");
        RadioButton ellipseButton = new RadioButton("Ellipse");

        //Set radio buttons to the toggleGroup
        circleButton.setToggleGroup(group);
        rectangleButton.setToggleGroup(group);
        ellipseButton.setToggleGroup(group);

        circleButton.setSelected(true);
        switchShape(circle, pane);

        controlBox.getChildren().addAll(circleButton, rectangleButton, ellipseButton);
        //Create a checkbox to fill shapes with random color
        CheckBox fillCheckBox = new CheckBox("Fill");
        controlBox.getChildren().add(fillCheckBox);

        pane.setBottom(controlBox);

        //Add a listener to ToggleGroup to switch shapes from the buttons
        group.selectedToggleProperty().addListener((observableValue, oldValue, newValue) -> {
                if (newValue == circleButton) {
                    switchShape(circle, pane);
                } else if (newValue == rectangleButton) {
                    switchShape(rectangle, pane);
                } else if (newValue == ellipseButton) {
                    switchShape(ellipse, pane);
                }
        });

        //Add to checkbox fill the shape with random color when selected
        fillCheckBox.setOnAction(e -> {
            if (fillCheckBox.isSelected()) {
                currentFill = Color.color(Math.random(), Math.random(), Math.random());
            } else {
                currentFill = null;
            }
            updateFill();
        });

        fillCheckBox.setSelected(false);

        //Create a scene
        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("Shape and Color");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    //Switch shapes while keeping the fill color and stroke
    private void switchShape(Shape shape, BorderPane pane) {
        currentShape = shape;
        pane.setCenter(currentShape);
        updateFill();
        currentShape.setStroke(Color.DARKOLIVEGREEN);
    }
    //Update the fill color of the current shape
    private void updateFill() {
        if (currentShape != null) {
            currentShape.setFill(currentFill);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
