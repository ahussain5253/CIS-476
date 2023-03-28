package HotelRoomManagementSystem;


public interface Chain {
    
    public void setNextChain(Chain nextChain);
    
    public void processBid(Bid requestedBid);
    
}
