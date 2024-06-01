
package kauhospitalsystem;

public class Nurse extends Person {
    
   private int experience; 

    public Nurse(int experience, int id, String name, char gender) {       
        super(id, name, gender);
        this.experience = experience;
    }
    
    public int getExperience (){
        return experience;
    }
    
    public void setExperience(int experience) {
        if (experience > 0 && experience <= 40) {
            this.experience = experience;
        } else {
            System.out.println("Error: Experience must be a positive integer and cannot exceed 40 years.");
        }
    }    
    
    public String toString (){
        return super.toString() + "\n\tExperience Year: " + getExperience();
    }
}

