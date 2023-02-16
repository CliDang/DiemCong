package com.mycompany.javafx;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int a = 1;
        if (a>0){
            App.setRoot("secondary");
        }
    }
}
