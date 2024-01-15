module com.example.nomor2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.nomor2 to javafx.fxml;
    exports com.example.nomor2;
}