module com.example.forntend {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.forntend to javafx.fxml;
    exports com.example.forntend;
}