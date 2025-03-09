import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ColorExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(10);

        Rectangle wickedGreenRect = new Rectangle(100,100);
        wickedGreenRect.setFill(Color.rgb(34, 187,44,73));

        Rectangle namedColorRect = new Rectangle(100, 100);
        namedColorRect.setFill(Color.LIMEGREEN);

        root.getChildren().addAll(wickedGreenRect, namedColorRect);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("JavaFX Color Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

public static void main(String[] args) {
        launch(args);
    }
}
