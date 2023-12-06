module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


//    opens controller to javafx.fxml;
//    exports controller;
    exports oop;
    opens oop to javafx.fxml;
    exports main;
    opens main to javafx.fxml;
    exports com.example.demo;
    opens com.example.demo to javafx.fxml;
}