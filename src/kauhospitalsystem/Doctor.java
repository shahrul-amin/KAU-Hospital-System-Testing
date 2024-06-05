package kauhospitalsystem;

public class Doctor {
    
    private int doctorId;
    private char gender;  

    public Doctor(int doctorId, char gender) {
        setDoctorId(doctorId);
        setGender(gender);
    }

    public int getDoctorId() {
        return doctorId;
    }

    public char getGender() {
        return gender;
    }
    
    public void setDoctorId(int doctorId) {
        if (doctorId >= 5000 && doctorId <= 7999) {
            this.doctorId = doctorId;
        } else {
            throw new IllegalArgumentException("Error: Doctor ID must be between 5000 and 7999.");
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
        return "\tDoctor ID: " + getDoctorId() + "\n\tGender: " + getGender();
    }
}
