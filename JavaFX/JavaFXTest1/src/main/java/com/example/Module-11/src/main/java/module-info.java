module com.example.module11 {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.xml.dom;


    opens com.example.module11 to javafx.fxml;
    exports com.example.module11;
}