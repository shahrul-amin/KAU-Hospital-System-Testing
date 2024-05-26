package kauhospitalsystem;

public abstract class Staff extends Person {

    private String specialization;

    public Staff(String specialization, int id, String name, String nationality, char gender, String phone) {
        super(id, name, nationality, gender, phone);
        setSpecialization(specialization);
    }

        // Getters
        public String getSpecialization() {
            return specialization;
        }
    
        // Setters
        public void setSpecialization(String specialization) {
            if (isValidSpecialization(specialization))
                this.specialization = specialization;
            else
                System.out.println("Error: Specialization must not exceed 50 characters.");
        }
    

    private boolean isValidSpecialization(String specialization) {
        return specialization.length() <= 50;
    }
}
