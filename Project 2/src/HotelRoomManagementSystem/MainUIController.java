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
    
    @FXML
    private Button processBidButton;
    @FXML
    public Label resultText;
    @FXML
    private TextField userBid;

    public int numStandardRooms = 45;
    public int numDeluxeRooms = 15;
    public int numSuiteRooms = 10;
    
    public interface Chain {        
        public void setNextChain(Chain nextChain);    
        public void processBid(Bid requestedBid);        
    }
    
    public class Bid {
        private int Bid;
        
        public Bid(int userBid) {
            Bid = userBid;
        }
        public int getBid() {return Bid;}
    }
    
    public class Suite implements Chain {
        private Chain nextInChain;
        
        @Override
        public void setNextChain (Chain nextChain) {
            nextInChain = nextChain;
        }

        @Override
        public void processBid(Bid requestedBid) {
            
            if (requestedBid.getBid() >= 280) {                 
                if (numSuiteRooms > 0) {
                    numSuiteRooms--;              
                    resultText.setText("Your Bid was accepted for a Suite Room.\nTotal Suite Rooms: " + numSuiteRooms);
                    System.out.println("Bid Processed Successfully");
                } else if (numSuiteRooms == 0) {
                    resultText.setText("All Suite rooms are SOLD OUT. Please enter new bid.");
                }
            } 
             else {
                nextInChain.processBid(requestedBid);
            }           
        }
    }
    
    public class Deluxe implements Chain {
        
        private Chain nextInChain;
        
        @Override
        public void setNextChain (Chain nextChain) {
            nextInChain = nextChain;
        }
        
        @Override
        public void processBid(Bid requestedBid) {
            
            if (requestedBid.getBid() >= 150 && requestedBid.getBid() < 280) {                 
                if (numDeluxeRooms > 0) {
                    numDeluxeRooms--;              
                    resultText.setText("Your Bid was accepted for a Deluxe Room.\nTotal Deluxe Rooms: " + numDeluxeRooms);
                    System.out.println("Bid Processed Successfully");
                } else if (numDeluxeRooms == 0) {
                    resultText.setText("All Deluxe rooms are SOLD OUT. Please enter new bid.");
                }
            } 
             else {
                nextInChain.processBid(requestedBid);
            }             
        }    
    }
    
    public class Standard implements Chain {
        
        private Chain nextInChain;
        
        @Override
        public void setNextChain (Chain nextChain) {
            nextInChain = nextChain;
        }
        
        @Override
        public void processBid(Bid requestedBid) {
            
            if (requestedBid.getBid() >= 80 && requestedBid.getBid() < 150) {                 
                if (numStandardRooms > 0) {
                    numStandardRooms--;              
                    resultText.setText("Your Bid was accepted for a Standard Room.\nTotal Standard Rooms: " + numStandardRooms);
                    System.out.println("Bid Processed Successfully");
                } else if (numStandardRooms == 0) {
                    resultText.setText("All Standard rooms are SOLD OUT. Please enter new bid.");
                }
            } 
             else {
                resultText.setText("Bid request rejected. Please enter a new bid.");
            }           
        }    
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    public void processBid(ActionEvent event) {
        
        Chain chain1 = new Suite();
        Chain chain2 = new Deluxe();
        Chain chain3 = new Standard();
        
        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
          
        int currentBid = Integer.parseInt(userBid.getText());
        Bid newBid = new Bid(currentBid);
        
        chain1.processBid(newBid);
        
    }
    
    
}
