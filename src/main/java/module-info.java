module java {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
//    requires com.google.gson;
//    requires org.json;
//    requires org.jsoup;
    requires com.fasterxml.jackson.databind;
    requires org.seleniumhq.selenium.api;
    requires org.seleniumhq.selenium.firefox_driver;
    requires org.json;
    requires org.jsoup;
    requires com.google.gson;
//    requires org.seleniumhq.selenium.grid;
//    requires io.netty.transport;

    opens com.example.forntend to javafx.fxml;
    exports com.example.forntend;
}
