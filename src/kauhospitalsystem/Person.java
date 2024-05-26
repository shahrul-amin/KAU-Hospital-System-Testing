package kauhospitalsystem;

import java.util.HashSet;
import java.util.Set;

public class Person {
   
    private int id;
    private String name, nationality;
    private char gender;
    private String phone;
    
    private static Set<Integer> idSet = new HashSet<>();

    public Person(int id, String name, String nationality, char gender, String phone) {
        setId(id);
        setName(name);
        setNationality(nationality);
        setGender(gender);
        setPhone(phone);
    }
   
    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public char getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    // Setters
    public void setId(int id) {
        if (isValidId(id))
            this.id = id;
        else
            System.out.println("Error: ID must be a positive integer consisting of exactly 4 digits (range: 0001 to 9999).");
    }

    public void setName(String name) {
        name = name.replace("_", " ");
        if (isValidName(name))
            this.name = name;
        else
            System.out.println("Error: Name must not exceed 50 characters.");
    }

    public void setNationality(String nationality) {
        if (isValidNationality(nationality))
            this.nationality = nationality;
        else
            System.out.println("Error: Nationality must not exceed 50 characters.");
    }

    public void setGender(char gender) {
        if (isValidGender(gender))
            this.gender = gender;
        else
            System.out.println("Error: Gender must be 'M' for Male or 'F' for Female.");
    }

    public void setPhone(String phone) {
        if (isValidPhone(phone))
            this.phone = phone;
        else
            System.out.println("Error: Invalid phone number format. Please enter a valid phone number.");
    }

    // Validation methods
private boolean isValidId(int id) {
    // Check if ID is within the valid range and has four digits
    if (id >= 1 && id <= 99999 && String.valueOf(id).length() == 5) {
        // Check for duplicate ID
        if (idSet.contains(id)) {
            System.out.println("Error: Duplicate ID.");
            return false;
        } else {
            // Add the ID to the set if it's not a duplicate
            idSet.add(id);
            return true;
        }
    } else {
        return false;
    }
}


    private boolean isValidName(String name) {
        return name.length() <= 50;
    }

    private boolean isValidNationality(String nationality) {
        return nationality.length() <= 50;
    }

    private boolean isValidGender(char gender) {
        return gender == 'M' || gender == 'F';
    }

    private boolean isValidPhone(String phone) {
        return phone.length() == 10 || phone.length() == 11 && phone.startsWith("01");
    }

    // toString method
    @Override
    public String toString() {
        return "\tID: " + getId() + "\n\tName: " + getName() + "\n\tNationality: " + getNationality() + "\n\tGender: " + getGender() + "\n\tPhone: " + getPhone();
    }
}
