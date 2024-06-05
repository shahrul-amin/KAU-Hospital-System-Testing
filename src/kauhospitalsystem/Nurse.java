package kauhospitalsystem;

public class Nurse {
    
    private int nurseId;
    private char gender; 

    public Nurse(int nurseId, char gender) {
        setNurseId(nurseId);
        setGender(gender);
    }
    
    // Getters
    public int getNurseId() {
        return nurseId;
    }
    
    public char getGender() {
        return gender;
    }
    
    // Setters
    public void setNurseId(int nurseId) {
        if (nurseId >= 8000 && nurseId <= 9999) {
            this.nurseId = nurseId;
        } else {
            throw new IllegalArgumentException("Error: Nurse ID must be between 8000 and 9999.");
        }
    }
    
    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Error: Gender must be 'M' or 'F'.");
        }
    }
    
    @Override
    public String toString() {
        return "\tNurse ID: " + getNurseId() + "\n\tGender: " + getGender();
    }
}
