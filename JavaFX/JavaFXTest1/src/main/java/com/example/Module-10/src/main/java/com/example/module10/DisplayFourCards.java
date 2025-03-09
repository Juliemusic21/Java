/*
Julie Sakai
CSD 405
Module 10 
12/6/24
 */
package com.example.module10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DisplayFourCards extends Application {

    private List<Image> cardImages = new ArrayList<>();
    private ImageView[] cardViews = new ImageView[4];

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Random 4 Cards");

        //Load the images of the cards
        loadCardImages();

        //Create ImageView for each card
        for (int i = 0; i < 4; i++) {
            cardViews[i] = new ImageView();
            cardViews[i].setFitHeight(150);
            cardViews[i].setFitWidth(100);
        }

        //Display random cards
        displayRandomCards();

        //Create refresh button
        Button button = new Button("Refresh");
        button.setOnAction((actionEvent) -> displayRandomCards());

        //Set up layout
        HBox hBox = new HBox(10, cardViews);
        BorderPane bp = new BorderPane();
        bp.setCenter(hBox);
        bp.setBottom(button);

        Scene scene = new Scene(bp, 450, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

private void loadCardImages() {
        File cardDir = new File ("src/cards");
        if (cardDir.exists() && cardDir.isDirectory()) {
            for(File file: cardDir.listFiles()) {
                if (file.isFile() && file.getName().endsWith(".png")) {
                    cardImages.add(new Image(file.toURI().toString()));
                }
            }
        }
    }
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
