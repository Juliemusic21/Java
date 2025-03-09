module com.example.module9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.module9 to javafx.fxml;
    exports com.example.module9;
}