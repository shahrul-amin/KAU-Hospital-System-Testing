package kauhospitalsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KAUHospitalSystem {

    private static List<Room> rooms = new ArrayList<>();
    private static List<Doctor> doctors = new ArrayList<>();
    private static List<Nurse> nurses = new ArrayList<>();
    private static List<Patient> patients = new ArrayList<>();
    private static List<Medicine> medicines = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
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

            switch (choice) {
                case 1:
                    addRoom(scanner);
                    break;
                case 2:
                    addDoctor(scanner);
                    break;
                case 3:
                    addNurse(scanner);
                    break;
                case 4:
                    addPatient(scanner);
                    break;
                case 5:
                    addMedicine(scanner);
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

    private static void addRoom(Scanner scanner) {
        try {
            System.out.print("Enter room number (1-399): ");
            int roomNo = scanner.nextInt();
            System.out.print("Enter charges (100.0-2000.0): ");
            double charges = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            Room room = new Room(roomNo, charges);
            rooms.add(room);
            System.out.println("Room added successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void addDoctor(Scanner scanner) {
        try {
            System.out.print("Enter doctor ID (5000-7999): ");
            int doctorId = scanner.nextInt();
            System.out.print("Enter consultation fees (50.0-99.0): ");
            double consultationFees = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            Doctor doctor = new Doctor(doctorId, consultationFees);
            doctors.add(doctor);
            System.out.println("Doctor added successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void addNurse(Scanner scanner) {
        try {
            System.out.print("Enter nurse ID (8000-9999): ");
            int nurseId = scanner.nextInt();
            System.out.print("Enter experience (0-40 years): ");
            int experience = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            Nurse nurse = new Nurse(experience, nurseId);
            nurses.add(nurse);
            System.out.println("Nurse added successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void addPatient(Scanner scanner) {
        try {
            System.out.print("Enter patient ID (1000-3999): ");
            int patientId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter illness: ");
            String illness = scanner.nextLine();
            Patient patient = new Patient(patientId, illness);
            patients.add(patient);
            System.out.println("Patient added successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void addMedicine(Scanner scanner) {
        try {
            System.out.print("Enter medicine code (4000-4514): ");
            int medicineCode = scanner.nextInt();
            System.out.print("Enter price (1.00-50.00): ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            Medicine medicine = new Medicine(medicineCode, price);
            medicines.add(medicine);
            System.out.println("Medicine added successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void displayAll() {
        System.out.println("\nRooms:");
        for (Room room : rooms) {
            System.out.println(room);
        }

        System.out.println("\nDoctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }

        System.out.println("\nNurses:");
        for (Nurse nurse : nurses) {
            System.out.println(nurse);
        }

        System.out.println("\nPatients:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }

        System.out.println("\nMedicines:");
        for (Medicine medicine : medicines) {
            System.out.println(medicine);
        }
    }
}
