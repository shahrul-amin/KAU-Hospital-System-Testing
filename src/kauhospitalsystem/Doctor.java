package kauhospitalsystem;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

public class Doctor extends Person {
    
 private double consultationFees; 

    public Doctor(double consultationFees, int id, String name, char gender) {
        super(id, name, gender);
        this.consultationFees = consultationFees;
        
    }
    
    public double getConsultationFees () {
        return consultationFees;
    }
    
    public void setConsultationFees (double consultationFees) {
        DecimalFormat df = new DecimalFormat("#.00");
        String formattedFees = df.format(consultationFees);
        
        // Reject charges with letters or more than three decimal places
        if (!Pattern.matches("\\d+(\\.\\d{1,2})?", formattedFees)) {
            System.out.println("Error: Invalid price format.");
            return;
        }
        this.consultationFees = Double.parseDouble(formattedFees);
    }
    
    public String toString () {
        DecimalFormat df = new DecimalFormat("#.00");
        String formattedFees = df.format(getConsultationFees());
        return super.toString() + "\n\tConsultation Fees: RM " + formattedFees;
        
    }
}

