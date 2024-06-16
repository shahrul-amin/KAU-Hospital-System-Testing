# KAUHospitalSystem

KAUHospitalSystem is a simple Java console application designed to manage a hospital system. It allows the user to add and display information about rooms, doctors, nurses, patients, and medicines.

## Features

- Add a new room with room number and charges
- Add a new doctor with doctor ID and gender
- Add a new nurse with nurse ID and gender
- Add a new patient with patient ID and illness
- Add a new medicine with medicine code and price
- Display all rooms, doctors, nurses, patients, and medicines

## Project Structure

The project contains the following main class:

- `KAUHospitalSystem`: The main class containing the program's entry point, main menu, and all the methods for managing rooms, doctors, nurses, patients, and medicines.

## Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/shahrul-amin/KAU-Hospital-System-Testing.git
    ```

2. Navigate to the project directory:
    ```bash
    cd KAU-Hospital-System-Testing
    ```

3. Compile the project:
    ```bash
    javac kauhospitalsystem/*.java
    ```

4. Run the project:
    ```bash
    java kauhospitalsystem.KAUHospitalSystem
    ```

## Usage

When you run the program, you will see the following menu:
- Add Room
- Add Doctor
- Add Nurse
- Add Patient
- Add Medicine
- Display All
- Exit

You can select an option by entering the corresponding number. Follow the prompts to add new rooms, doctors, nurses, patients, or medicines. You can also display all the records by selecting option 6.

## Example

To add a new room:

1. Select option `1` from the menu.
2. Enter the room number (e.g., `101`).
3. Enter the charges (e.g., `1500.00`).

To display all records, select option `6`.

## Methods

### KAUHospitalSystem

- `main(String[] args)`: The entry point of the application.
- `addRoom(int roomNo, double charges)`: Adds a new room.
- `addDoctor(int doctorId, char gender)`: Adds a new doctor.
- `addNurse(int nurseId, char gender)`: Adds a new nurse.
- `addPatient(int patientId, String illness)`: Adds a new patient.
- `addMedicine(int medicineCode, double price)`: Adds a new medicine.
- `displayAll()`: Displays all rooms, doctors, nurses, patients, and medicines.

## Tests

The project includes test classes for each of the add methods to ensure proper functionality. The test classes include:

- `DoctorTest`
- `NurseTest`
- `PatientTest`
- `MedicineTest`
- `RoomTest`

Make sure to compile and run these tests to verify the correctness of the system.

## Reference

rahmaAlghalib. (2022, Aug 8). GitHub - rahmaAlghalib/KAU-Hospital-System: Java Hospital management system. GitHub. [https://github.com/rahmaAlghalib/KAU-Hospital-System](https://github.com/rahmaAlghalib/KAU-Hospital-System)

