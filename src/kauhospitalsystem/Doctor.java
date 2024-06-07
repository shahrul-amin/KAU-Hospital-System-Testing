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
            throw new IllegalArgumentException("Invalid doctor ID");
        }
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Invalid gender");
        }
    }
    
    @Override
    public String toString() {
        return "\tDoctor ID: " + getDoctorId() + "\n\tGender: " + getGender();
    }
}
