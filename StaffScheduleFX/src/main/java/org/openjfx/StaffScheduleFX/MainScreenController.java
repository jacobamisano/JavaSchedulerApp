package org.openjfx.StaffScheduleFX;

import java.io.IOException;
import javafx.fxml.FXML;

public class MainScreenController {
    
    @FXML
    private void onBtnAddEmployeeClick() throws IOException{
    	App.setRoot("addEmployee");
    }
    
    @FXML
    private void onBtnAddTimeOffClick() throws IOException{
    	App.setRoot("timeOffRequest");
    }
    
    @FXML
    private void onBtnViewEmployeeClick() {
    	
    }
    
    @FXML
    private void onBtnEditSchedulePreferencesClick() {
    	
    }
    
    @FXML
    private void onBtnBuildScheduleClick() {
    	
    }
    
}
