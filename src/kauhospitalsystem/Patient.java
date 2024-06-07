package kauhospitalsystem;

public class Patient {

    private String illness;
    private int patientId;
    
    public Patient(int patientId, String illness) {
        setPatientId(patientId);
        setIllness(illness);
    }
   
    // Getters----------------------
    public String getIllness() {
        return illness;
    }

    public int getPatientId() {
        return patientId;
    }
    
    // Setters----------------------
    public void setIllness(String illness) {
        if (illness != null && !illness.trim().isEmpty()) {
            this.illness = illness;
        } else {
            throw new IllegalArgumentException("Illness cannot be empty");
        }
    }

    public void setPatientId(int patientId) {
        if (patientId >= 1000 && patientId <= 3999) {
            this.patientId = patientId;
        } else {
            throw new IllegalArgumentException("Invalid patient ID.");
        }
    }

    @Override
    public String toString() {
        return "\tPatient ID: " + getPatientId() + "\nIllness: " + getIllness();
    }
}
