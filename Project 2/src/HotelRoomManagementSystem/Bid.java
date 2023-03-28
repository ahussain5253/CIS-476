package HotelRoomManagementSystem;

public class Bid {
    
    private int Bid;
    private String room;
    
    public Bid(int userBid, String roomRequested) {
        Bid = userBid;
        room = roomRequested;       
    }
    
    public int getBid() { return Bid; }
    public String getRoom() { return room; }
    
    
}
