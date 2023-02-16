module com.mycompany.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;

    opens com.mycompany.javafx to javafx.fxml;
    exports com.mycompany.javafx;
}
