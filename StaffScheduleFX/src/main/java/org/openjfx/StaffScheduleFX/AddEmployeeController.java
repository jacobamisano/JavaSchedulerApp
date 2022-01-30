package org.openjfx.StaffScheduleFX;

import java.io.IOException;
import javafx.fxml.FXML;

public class AddEmployeeController {

    @FXML
    private void onBtnAddEmployeeClick() throws IOException {
        App.setRoot("mainScreen");
    }
    
    @FXML
    private void onBtnCancelEmployeeClick() throws IOException{
    	App.setRoot("mainScreen");
    }
}