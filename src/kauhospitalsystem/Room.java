package kauhospitalsystem;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class Room {
    
    private int roomNo;
    private String floor;
    private String block;
    private double charges;
    
    // Set to store unique room combinations
    private static Set<String> roomSet = new HashSet<>();
    
    // Constructor
    public Room(int roomNo, String floor, String block, double charges) {
        // Check for duplicate room
        String roomKey = floor.toLowerCase() + block.toLowerCase() + roomNo;
        if (!roomSet.contains(roomKey)) {
            setRoomNo(roomNo);
            setFloor(floor);
            setBlock(block);
            setCharges(charges);
            roomSet.add(roomKey);
        } else {
            System.out.println("Error: Room already exists in the same block and floor.");
        }
    }
    
    // Getters
    public int getRoomNo() {
        return roomNo;
    }
    
    public String getFloor() {
        return floor;
    }
    
    public String getBlock() {
        return block;
    }
    
    public double getCharges() {
        return charges;
    }
    
    // Setters
    public void setRoomNo(int roomNo) {
        if (isValidRoomNumber(roomNo))
            this.roomNo = roomNo;
        else
            System.out.println("Error: Invalid room number.");
    }
    
    public void setFloor(String floor) {
        if (isValidFloor(floor))
            this.floor = floor;
        else
            System.out.println("Error: Invalid floor.");
    }
    
    public void setBlock(String block) {
        if (isValidBlock(block))
            this.block = block;
        else
            System.out.println("Error: Invalid block.");
    }
    
    public void setCharges(double charges) {
        DecimalFormat df = new DecimalFormat("#.00");
        String formattedCharges = df.format(charges);
        
        // Reject charges with letters or more than three decimal places
        if (!Pattern.matches("\\d+(\\.\\d{1,2})?", formattedCharges)) {
            System.out.println("Error: Invalid charges format.");
            return;
        }

        this.charges = Double.parseDouble(formattedCharges);
    }
    
    
    // Validation methods
    private boolean isValidRoomNumber(int roomNo) {
        return roomNo >= 1 && roomNo <= 399;
    }
    
    private boolean isValidFloor(String floor) {
        return floor.equalsIgnoreCase("ground") || floor.equalsIgnoreCase("first") || floor.equalsIgnoreCase("second");
    }
    
    private boolean isValidBlock(String block) {
        return block.equalsIgnoreCase("A") || block.equalsIgnoreCase("B") || block.equalsIgnoreCase("C");
    }
    
    // toString method
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        String formattedCharges = df.format(getCharges());
        return "\tRoom No: " + getRoomNo() + "\n\tLocated in floor: " + getFloor() + "\n\tBlock: " + getBlock() + "\n\tCharges: RM " + formattedCharges;
    }
}