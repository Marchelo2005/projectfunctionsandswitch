module com.example.projectfunctionsandswitch {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projectfunctionsandswitch to javafx.fxml;
    exports com.example.projectfunctionsandswitch;
}