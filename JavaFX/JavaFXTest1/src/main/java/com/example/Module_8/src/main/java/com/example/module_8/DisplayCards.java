/*
Julie Sakai
CSD-405
Redo for Module 8 Programming Assignment
12/15/24
 */

package com.example.module_8;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DisplayCards extends Application {
    private List<Image> cardImages = new ArrayList<>();
    private ImageView[] cardViews = new ImageView[4];

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Random Display Cards");

        loadCardImages();

        for (int i = 0; i < 4; i++) {
            cardViews[i] = new ImageView();
            cardViews[i].setFitHeight(150);
            cardViews[i].setFitWidth(100);
        }
        displayRandomCards();
        //Create a button to refresh the displayed cards
        Button button = new Button("Refresh");
        button.setOnAction((actionEvent) ->  displayRandomCards());

        //Set up the layout
        HBox hBox = new HBox(10, cardViews);
        BorderPane bp = new BorderPane();
        bp.setCenter(hBox);
        bp.setBottom(button);

        //Create scene and display
        Scene scene = new Scene(bp, 450, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //Insert card images from "src/cards" directory
    private void loadCardImages() {
        File cardDir = new File("src/cards");
        if (cardDir.exists() && cardDir.isDirectory()) {
            for (File file : cardDir.listFiles()) {
                if (file.isFile() && file.getName().endsWith(".png")) {
                    cardImages.add(new Image(file.toURI().toString()));
                }
            }
        }
    }
    //Display four random cards
    private void displayRandomCards() {
            Collections.shuffle(cardImages);
            for (int i = 0; i < 4; i++) {
                cardViews[i].setImage(cardImages.get(i));
            }
    }

    public static void main(String[] args) {
                launch(args);
        }
}

