module com.example.csd340_mod1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csd340_mod1 to javafx.fxml;
    exports com.example.csd340_mod1;
}