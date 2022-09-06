module com.example.guide {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.guide to javafx.fxml;
    exports com.example.guide;
}