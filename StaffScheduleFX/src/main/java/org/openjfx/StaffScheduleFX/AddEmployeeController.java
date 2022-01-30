package org.openjfx.StaffScheduleFX;

import java.io.IOException;
import javafx.fxml.FXML;

public class AddEmployeeController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("mainScreen");
    }
}