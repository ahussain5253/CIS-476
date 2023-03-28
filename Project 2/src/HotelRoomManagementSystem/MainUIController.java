package HotelRoomManagementSystem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class MainUIController implements Initializable{

    public int numStandardRooms = 45;
    public int numDeluxeRooms = 15;
    public int numSuiteRooms = 10;
    
    @FXML
    private Button processBidButton;
    @FXML
    public Label resultText;
    @FXML
    private TextField userBid;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void processBid(ActionEvent event) {        
        
        int bid = Integer.parseInt(userBid.getText());
        
        if (bid >= 280 && numSuiteRooms != 0) {
            
            numSuiteRooms--;
            
            resultText.setText("Your Bid was accepted and you have been given a Suite room!\nSuites Available: " + numSuiteRooms);
            
        }
        
    }
    
}
