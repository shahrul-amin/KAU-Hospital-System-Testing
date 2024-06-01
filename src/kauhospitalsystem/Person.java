package kauhospitalsystem;

import java.util.HashSet;
import java.util.Set;

public class Person {
   
    private int id;
    private char gender;
    private String name;
    
    protected static Set<Integer> idSet = new HashSet<>();

    public Person(int id, String name, char gender) {
        setId(id);
        setName(name);
        setGender(gender);
    }
   
    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    // Setters
    public void setId(int id) {
        if (isValidId(id))
            this.id = id;
        else
            System.out.println("Error: id for Patient must be in range 1000 to 3999, for Doctor must be in range 5000 to 7999 and for Nurse must be in range 8000 to 9999");
    }

    public boolean isValidId(int id){
        if(((id >= 1000) && (id<=3999)) || ((id >= 5000) && (id <= 7999)) || ((id >= 8000) && (id <= 9999))){
            return true;
        }else{
            return false;
        }
    }

    public void setName(String name) {
        name = name.replace("_", " ");
        this.name = name;
    }

    public void setGender(char gender) {
        if (isValidGender(gender))
            this.gender = gender;
        else
            System.out.println("Error: Gender must be 'M' for Male or 'F' for Female.");
    }

    private boolean isValidGender(char gender) {
        return gender == 'M' || gender == 'F';
    }

    // toString method
    @Override
    public String toString() {
        return "\tID: " + getId() + "\n\tName: " + getName()  + "\n\tGender: " + getGender();
    }
}
