package kauhospitalsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.regex.Pattern;

public class KAUHospitalSystem {

    private static List<Room> rooms = new ArrayList<>();
    private static List<Doctor> doctors = new ArrayList<>();
    private static List<Nurse> nurses = new ArrayList<>();
    private static List<Patient> patients = new ArrayList<>();
    private static List<Medicine> medicines = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("");
            System.out.println("KAU Hospital System Menu");
            System.out.println("1. Add Room");
            System.out.println("2. Add Doctor");
            System.out.println("3. Add Nurse");
            System.out.println("4. Add Patient");
            System.out.println("5. Add Medicine");
            System.out.println("6. Display All");
            System.out.println("7. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            String result;
            switch (choice) {
                case 1:
                    System.out.print("Enter room number (1-399): ");
                    int roomNo = scanner.nextInt();
                    System.out.print("Enter charges (100.0-2000.0): ");
                    double charges = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    result = addRoom(roomNo, charges);
                    System.out.println(result);
                    break;
                case 2:
                    System.out.print("Enter doctor ID (5000-7999): ");
                    int doctorId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter gender (M/F): ");
                    char doctorGender = scanner.nextLine().charAt(0);
                    result = addDoctor(doctorId, doctorGender);
                    System.out.println(result);
                    break;
                case 3:
                    System.out.print("Enter nurse ID (8000-9999): ");
                    int nurseId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter gender (M/F): ");
                    char nurseGender = scanner.nextLine().charAt(0);
                    result = addNurse(nurseId, nurseGender);
                    System.out.println(result);
                    break;
                case 4:
                    System.out.print("Enter patient ID (1000-3999): ");
                    int patientId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter illness: ");
                    String illness = scanner.nextLine();
                    result = addPatient(patientId, illness);
                    System.out.println(result);
                    break;
                case 5:
                    System.out.print("Enter medicine code (4000-4514): ");
                    int medicineCode = scanner.nextInt();
                    System.out.print("Enter price (1.00-50.00): ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    result = addMedicine(medicineCode, price);
                    System.out.println(result);
                    break;
                case 6:
                    displayAll();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    static String addRoom(int roomNo, double charges) {
        try {
            Room room = new Room(roomNo, charges);
            rooms.add(room);
            return "Room successfully added";
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    static String addDoctor(int doctorId, char gender) {
        try {
            Doctor doctor = new Doctor(doctorId, gender);
            doctors.add(doctor);
            return "Doctor successfully added";
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    static String addNurse(int nurseId, char gender) {
        try {
            Nurse nurse = new Nurse(nurseId, gender);
            nurses.add(nurse);
            return "Nurse successfully added";
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    static String addPatient(int patientId, String illness) {
        try {
            Patient patient = new Patient(patientId, illness);
            patients.add(patient);
            return "Patient successfully added";
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    static String addMedicine(int medicineCode, double price) {
        try {
            Medicine medicine = new Medicine(medicineCode, price);
            medicines.add(medicine);
            return "Medicine successfully added";
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    private static void displayAll() {
        System.out.println("\nRooms:");
        for (Room room : rooms) {
            System.out.println(room);
            System.out.println();
        }

        System.out.println("\nDoctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
            System.out.println();
        }

        System.out.println("\nNurses:");
        for (Nurse nurse : nurses) {
            System.out.println(nurse);
            System.out.println();
        }

        System.out.println("\nPatients:");
        for (Patient patient : patients) {
            System.out.println(patient);
            System.out.println();
        }

        System.out.println("\nMedicines:");
        for (Medicine medicine : medicines) {
            System.out.println(medicine);
            System.out.println();
        }
    }

    public static class Nurse {

        private int nurseId;
        private char gender; 

        public Nurse(int nurseId, char gender) {
            setNurseId(nurseId);
            setGender(gender);
        }

        // Getters
        public int getNurseId() {
            return nurseId;
        }

        public char getGender() {
            return gender;
        }

        // Setters
        public void setNurseId(int nurseId) {
            if (nurseId >= 8000 && nurseId <= 9999) {
                this.nurseId = nurseId;
            } else {
                throw new IllegalArgumentException("Invalid nurse ID");
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
            return "\tNurse ID: " + getNurseId() + "\n\tGender: " + getGender();
        }
    }

    public static class Doctor {

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

    public static class Medicine {

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
                throw new IllegalArgumentException("Invalid medicine code");
            }
        }

        public void setPrice(double price) {
            DecimalFormat df = new DecimalFormat("#.00");
            String formattedPrice = df.format(price);

            // Reject charges with letters or more than two decimal places
            if (!Pattern.matches("\\d+(\\.\\d{1,2})?", formattedPrice)) {
                throw new IllegalArgumentException("Invalid price");
            }

            double parsedPrice = Double.parseDouble(formattedPrice);
            if (parsedPrice < 1.00 || parsedPrice > 50.00) {
                throw new IllegalArgumentException("Invalid price");
            }

            this.price = parsedPrice;
        }

        @Override
        public String toString() {
            return "\tMedicine Code: " + getMedicineCode() + "\n\tPrice: " + getPrice();
        }
    }

    public static class Patient {

        private int patientId;
        private String illness;

        public Patient(int patientId, String illness) {
            setPatientId(patientId);
            setIllness(illness);
        }

        // Getters
        public int getPatientId() {
            return patientId;
        }

        public String getIllness() {
            return illness;
        }

        // Setters
        public void setPatientId(int patientId) {
            if (patientId >= 1000 && patientId <= 3999) {
                this.patientId = patientId;
            } else {
                throw new IllegalArgumentException("Invalid patient ID");
            }
        }

        public void setIllness(String illness) {
            if (!illness.isEmpty()) {
                this.illness = illness;
            } else {
                throw new IllegalArgumentException("Illness cannot be null");
            }
        }

        @Override
        public String toString() {
            return "\tPatient ID: " + getPatientId() + "\n\tIllness: " + getIllness();
        }
    }

    public static class Room {

        private int roomNo;
        private double charges;

        public Room(int roomNo, double charges) {
            setRoomNo(roomNo);
            setCharges(charges);
        }

        // Getters
        public int getRoomNo() {
            return roomNo;
        }

        public double getCharges() {
            return charges;
        }

        // Setters
        public void setRoomNo(int roomNo) {
            if (roomNo >= 1 && roomNo <= 399) {
                this.roomNo = roomNo;
            } else {
                throw new IllegalArgumentException("Invalid room number");
            }
        }

        public void setCharges(double charges) {
            DecimalFormat df = new DecimalFormat("#.00");
            String formattedCharges = df.format(charges);

            // Reject charges with letters or more than two decimal places
            if (!Pattern.matches("\\d+(\\.\\d{1,2})?", formattedCharges)) {
                throw new IllegalArgumentException("Invalid charges");
            }

            double parsedCharges = Double.parseDouble(formattedCharges);
            if (parsedCharges < 100.0 || parsedCharges > 2000.0) {
                throw new IllegalArgumentException("Invalid charges");
            }

            this.charges = parsedCharges;
        }

        @Override
        public String toString() {
            return "\tRoom No: " + getRoomNo() + "\n\tCharges: " + getCharges();
        }
    }
}
