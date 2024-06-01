package kauhospitalsystem;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class Medicine {
    
    private int medicineCode;
    private String name;
    private double price;
    
    private static Set<Integer> medicineCodes = new HashSet<>();
    private static Set<String> medicineNames = new HashSet<>();
    
    public Medicine(int medicineCode, String name, double price) {
        if (!medicineCodes.contains(medicineCode) && !medicineNames.contains(name.toLowerCase())) {
            setMedicineCode(medicineCode);
            setName(name);
            setPrice(price);
            medicineCodes.add(medicineCode);
            medicineNames.add(name.toLowerCase());
        } else {
            System.out.println("Error: Duplicate medicine code or name.");
        }
    }
    
    // Getters
    public int getMedicineCode() {
        return medicineCode;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    // Setters
    public void setMedicineCode(int medicineCode) {
        if (isValidMedicineCode(medicineCode))
            this.medicineCode = medicineCode;
        else
            System.out.println("Error: Invalid medicine code format.");
    }
    
    public void setName(String name) {
        name = name.replace("_", " ");
        if (isValidName(name)) {
            this.name = capitalizeWords(name);
        } else {
            System.out.println("Error: Invalid medicine name format.");
        }
    }
    
    public void setPrice(double price) {
        DecimalFormat df = new DecimalFormat("#.00");
        String formattedPrice = df.format(price);
        
        // Reject charges with letters or more than three decimal places
        if (!Pattern.matches("\\d+(\\.\\d{1,2})?", formattedPrice)) {
            System.out.println("Error: Invalid price format.");
            return;
        }

        this.price = Double.parseDouble(formattedPrice);
    }
    
    // Validation methods
    private boolean isValidMedicineCode(int medicineCode) {
        String codeStr = String.valueOf(medicineCode);
        return Pattern.matches("4[0-9]{3}", codeStr) && medicineCode >= 4000 && medicineCode <= 4514;
    }
    
    private boolean isValidName(String name) {
        return !name.matches(".*\\d.*");
    }
    
    // Capitalize the first letter of each word in the name
    private String capitalizeWords(String str) {
        String[] words = str.split("\\s+");
        StringBuilder capitalized = new StringBuilder();
        for (String word : words) {
            capitalized.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        return capitalized.toString().trim();
    }
    
    // toString method
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        String formattedPrice = df.format(getPrice());
        return "\tMedicine Code: " + getMedicineCode() + "\n\tName: " + getName() + "\n\tPrice: RM " + formattedPrice;
    }
}
