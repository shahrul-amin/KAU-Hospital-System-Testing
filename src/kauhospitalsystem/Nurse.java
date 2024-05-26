
package kauhospitalsystem;

public class Nurse extends Staff {
    
   private int experience; 

    public Nurse(int experience, String specialization, int id, String name, String nationality, char gender, String phone) {       
        super(specialization, id, name, nationality, gender, phone);
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

