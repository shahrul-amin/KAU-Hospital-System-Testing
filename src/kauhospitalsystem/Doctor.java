package kauhospitalsystem;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

public class Doctor {
    
    private int doctorId;
    private double consultationFees; 

    public Doctor(int doctorId, double consultationFees) {
        setDoctorId(doctorId);
        setConsultationFees(consultationFees);
    }
    
    public double getConsultationFees() {
        return consultationFees;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setConsultationFees(double consultationFees) {
        DecimalFormat df = new DecimalFormat("#.00");
        String formattedFees = df.format(consultationFees);
        
        // Reject charges with letters or more than two decimal places
        if (!Pattern.matches("\\d+(\\.\\d{1,2})?", formattedFees)) {
            throw new IllegalArgumentException("Error: Invalid price format.");
        }
        double fees = Double.parseDouble(formattedFees);
        if (fees < 50.0 || fees > 99.0) {
            throw new IllegalArgumentException("Error: Consultation fees must be between RM 50.0 and RM 99.0.");
        }
        this.consultationFees = fees;
    }
    
    public void setDoctorId(int doctorId) {
        if (doctorId >= 5000 && doctorId <= 7999) {
            this.doctorId = doctorId;
        } else {
            throw new IllegalArgumentException("Error: Doctor ID must be between 5000 and 7999.");
        }
    }
    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        String formattedFees = df.format(getConsultationFees());
        return "Doctor ID: " + getDoctorId() + "\n\tConsultation Fees: RM " + formattedFees;
    }
}
