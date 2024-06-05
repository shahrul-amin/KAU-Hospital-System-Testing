package kauhospitalsystem;

public class Nurse {
    
    private int experience;
    private int nurseId; 

    public Nurse(int nurseId, int experience) {
        setNurseId(nurseId);
        setExperience(experience);
    }
    
    // Getters
    public int getExperience() {
        return experience;
    }
    
    public int getNurseId() {
        return nurseId;
    }
    
    // Setters
    public void setExperience(int experience) {
        if (experience >= 0 && experience <= 40) {
            this.experience = experience;
        } else {
            throw new IllegalArgumentException("Error: Experience must be between 0 and 40 years.");
        }
    }
    
    public void setNurseId(int nurseId) {
        if (nurseId >= 8000 && nurseId <= 9999) {
            this.nurseId = nurseId;
        } else {
            throw new IllegalArgumentException("Error: Nurse ID must be between 8000 and 9999.");
        }
    }
    
    @Override
    public String toString() {
        return "Nurse ID: " + getNurseId() + "\n\tExperience Year: " + getExperience();
    }
}
