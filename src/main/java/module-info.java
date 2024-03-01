module com.example.javafxsondeneme {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.javafxsondeneme to javafx.fxml;
    exports com.example.javafxsondeneme;
    exports com.example.javafxsondeneme.firmalar;
    opens com.example.javafxsondeneme.firmalar to javafx.fxml;
}