package HotelRoomManagementSystem;

public class Suite implements Chain {
    
    private Chain nextInChain;
    public void setNextChain(Chain nextChain) {       
        nextInChain = nextChain;        
    }
    
    public void processBidRequest(Bid userBid) {      
    }

    @Override
    public void processBid(Bid requestedBid) {
    }
    
}
