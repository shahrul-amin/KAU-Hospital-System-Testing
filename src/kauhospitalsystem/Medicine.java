package kauhospitalsystem;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

public class Medicine {
    
    private int medicineCode;
    private double price;
    
    public Medicine(int medicineCode, double price) {
        setMedicineCode(medicineCode);
        setPrice(price);
    }
    
    // Getters
    public int getMedicineCode() {
        return medicineCode;
    }
    
    public double getPrice() {
        return price;
    }
    
    // Setters
    public void setMedicineCode(int medicineCode) {
        if (medicineCode >= 4000 && medicineCode <= 4514) {
            this.medicineCode = medicineCode;
        } else {
            throw new IllegalArgumentException("Error: Medicine code must be between 4000 and 4514.");
        }
    }
    
    public void setPrice(double price) {
        DecimalFormat df = new DecimalFormat("#.00");
        String formattedPrice = df.format(price);
        
        // Reject charges with letters or more than two decimal places
        if (!Pattern.matches("\\d+(\\.\\d{1,2})?", formattedPrice)) {
            throw new IllegalArgumentException("Error: Invalid price format.");
        }

        double parsedPrice = Double.parseDouble(formattedPrice);
        if (parsedPrice < 1.00 || parsedPrice > 50.00) {
            throw new IllegalArgumentException("Error: Price must be between RM 1.00 and RM 50.00.");
        }

        this.price = parsedPrice;
    }
    
    // toString method
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        String formattedPrice = df.format(getPrice());
        return "\tMedicine Code: " + getMedicineCode() + "\n\tPrice: RM " + formattedPrice;
    }
}
