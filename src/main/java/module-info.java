module org.example.labapotoki1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.labapotoki1 to javafx.fxml;
    exports org.example.labapotoki1;
}