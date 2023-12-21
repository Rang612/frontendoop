module com.example.forntend {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.json;
    requires okio;

    opens com.example.forntend to javafx.fxml;
    exports com.example.forntend;
}