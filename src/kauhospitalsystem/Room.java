package kauhospitalsystem;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;

public class Room {
    
    private int roomNo;
    private double charges;
    
    // Set to store unique room combinations
    private static Set<Integer> roomSet = new HashSet<>();
    
    // Constructor
    public Room(int roomNo, double charges) {
        // Check for duplicate room
        if (!roomSet.contains(roomNo)) {
            setRoomNo(roomNo);
            setCharges(charges);
            roomSet.add(roomNo);
        } else {
            throw new IllegalArgumentException("Error: Room already exists");
        }
    }
    
    // Getters
    public int getRoomNo() {
        return roomNo;
    }
    
    public double getCharges() {
        return charges;
    }
    
    // Setters
    public void setRoomNo(int roomNo) {
        if (roomNo >= 1 && roomNo <= 399) {
            this.roomNo = roomNo;
        } else {
            throw new IllegalArgumentException("Error: Invalid room number.");
        }
    }
    
    public void setCharges(double charges) {
        if (charges >= 100 && charges <= 2000) {
            this.charges = charges;
        } else {
            throw new IllegalArgumentException("Error: Charges must be between RM 100 and RM 2000.");
        }
    }
    
    // toString method
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        String formattedCharges = df.format(getCharges());
        return "\tRoom No: " + getRoomNo() + "\n\tCharges: RM " + formattedCharges;
    }
}
