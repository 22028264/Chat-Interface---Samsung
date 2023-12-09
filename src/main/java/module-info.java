module com.example.messengerfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.messengerfx to javafx.fxml;
    exports com.example.messengerfx;
}