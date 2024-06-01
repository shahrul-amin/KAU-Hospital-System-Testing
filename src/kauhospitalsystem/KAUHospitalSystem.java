package kauhospitalsystem;

import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class KAUHospitalSystem {
    
   //GET DOCTOR METHOD------------------------------
    private static Doctor getDoctor(Scanner input) {

        //Read values from file
        double consultationFees = input.nextDouble();
        int id = input.nextInt();
        String name = input.next();
        char gender = input.next().charAt(0);
        
        // Create Doctor object and assgining values
        Doctor doctor = new Doctor(consultationFees, id, name, gender);

        // return Doctor Object
        return doctor;
    }
    
   //GET NURSE METHOD-----------------------------
    private static Nurse getNurse(Scanner input) {

        int experience = input.nextInt();
        int id = input.nextInt();
        String name = input.next();
        char gender = input.next().charAt(0);

        Nurse nurse = new Nurse(experience, id, name, gender);

        return nurse;
    }
    
   // GET ROOM METHOD---------------------------
    private static Room getRoom(Scanner input) {

        int roomNo = input.nextInt();
        String floor = input.next();
        String block = input.next();
        double charges = input.nextDouble();

        Room room = new Room(roomNo, floor, block, charges);

        return room;

    }

   // GET MEDICINE METHOD------------------------------------- 
    private static Medicine getMedicineRecord(Scanner input) {

        int medicineCode = input.nextInt();
        String name = input.next();
        double price = input.nextDouble();

        Medicine medicine = new Medicine(medicineCode, name, price);

        return medicine;
    }

   // GET PATIENT METHOD------------------------------------ 
    private static Patient getPatientRecord(Scanner input) {

        String illness = input.next();
        String bloodGroup = input.next();
        int id = input.nextInt();
        String name = input.next();
        char gender = input.next().charAt(0);
        int totalMedicine = input.nextInt();

        Patient patient = new Patient(illness, bloodGroup, id, name, gender, totalMedicine);

        return patient;
    }

   // MAIN--------------------------------------------------------------- 
    public static void main(String[] args) throws FileNotFoundException {

        // create files
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        // check if the input file exists
        if (!inputFile.exists()) {
            System.out.println(inputFile + " dose not exists");
        }

        // create scanner to read from file
        Scanner input = new Scanner(inputFile);
        
        // create printwriter to write to file
        PrintWriter output = new PrintWriter(outputFile);

        
        // read the size of room array
        int roomsArraySize = input.nextInt();
        // create room array list
        ArrayList<Room> HRooms = new ArrayList<>();
        
        
        // read the size of medicine array
        int medicineArraySize = input.nextInt();
        // create medicine array list
        ArrayList<Medicine> HMedicines = new ArrayList<>();

        
        // read the size of person array
        int personArraySize = input.nextInt();
        // create person array list
        ArrayList<Person> HPerson = new ArrayList<>();
        
        

        String command;
        output.println("--------------- Welcome to KAU Hospital System ---------------");
        
        
        
        // loop 1 , to read the commands ADD ROOM and ADD MEDICINE 
        do {

            command = input.next();

            //------------------------------------------
            if (command.equalsIgnoreCase("Add_Room")) {

                for (int i = 0; i < roomsArraySize; i++) {
                    
                    // send input to ADD ROOM method then add room object to the array list
                    HRooms.add(getRoom(input));

                    // print room object details
                    output.println("Command Add_Room: Add a new room record in the System");
                    output.println(HRooms.get(i).toString());
                    output.println();
                    output.println("----------------------------------------------------------------");

                    command = input.next();

                }

            }

            //------------------------------------------
            if (command.equalsIgnoreCase("Add_Medicine")) {
                for (int i = 0; i < medicineArraySize; i++) {
                    
                    // send input to ADD MEDICINE method then add medicine object to array list
                    HMedicines.add(getMedicineRecord(input));

                    // print medicine object details
                    output.println("Command Add_Medicine: Add a new Medicine record in the System");
                    output.println(HMedicines.get(i).toString());
                    output.println();
                    output.println("----------------------------------------------------------------");

                    command = input.next();
                }
            }

        } while (!(command.equalsIgnoreCase("Add_Room") || (!command.equalsIgnoreCase("Add_Medicine"))));
        
         
        

       // loop 2 , to read commands ADD DOCTOR, ADD NURSE, ADD PATIENT 
        for (int i = 0; i < personArraySize; i++) {
           // in a for loop becuase they all in the same array 
            
           
            if (command.equalsIgnoreCase("Add_Doctor")) {
                
                // send input to ADD DOCTOR method then add doctor object to array list
                HPerson.add(getDoctor(input));

            }
            
            if (command.equalsIgnoreCase("Add_Nurse")) {
                
                // send input to ADD NURSE method then add nurse object to array list
                HPerson.add(getNurse(input));

            }
            
            if (command.equalsIgnoreCase("Add_Patient")) {
                
                // send input to ADD PATIENT method then add patient object to array list
                HPerson.add(getPatientRecord(input));

            }
            

            command = input.next();

        }
        
        
        
        
      // loop 3 , to print details of Doctor, Nurse , and Patient
        for (int i = 0; i < personArraySize; i++) {

            // if this object is doctor then print doctor details 
            if (HPerson.get(i) instanceof Doctor) {

                output.println("Command Add_Doctor: Add a new doctor record in the System");
                Doctor doctor = (Doctor) HPerson.get(i);
                output.println(doctor.toString());
                output.println();
                output.println("----------------------------------------------------------------");

            }

            // if this object is nurse then print nurse details
            if (HPerson.get(i) instanceof Nurse) {

                output.println("Command Add_Nurse: Add a new nurse record in the System");
                Nurse nurse = (Nurse) HPerson.get(i);
                output.println(nurse.toString());
                output.println();
                output.println("----------------------------------------------------------------");

            }

            // if this object is patient then print patient details
            if (HPerson.get(i) instanceof Patient) {

                output.println("Command Add_Patient: ");
                output.println("Add a new Patient record in the System");  
                Patient patient = (Patient) HPerson.get(i);
                output.println(patient.toString());
                output.println();
                output.println("-------------------------------------------------------------------------------");
            }

        }
        
        
        

        Medicine[] medicine;
        ArrayList<Patient> patients = new ArrayList<>();

        
        
        
       // loop 4 ,  to read command ASSIGN DOCTOR TO PATIENT, ASSGIN ROOM TO PATIENT, ASSGIN MEDICINE TO PATIENT and PRINT BILL
        do {
            
           //-------------------------------------------------------
            if (command.equalsIgnoreCase("Assign_Doctor_Patient")) {

                // read doctor and patient IDs from input file
                int doctorID = input.nextInt();
                int patientID = input.nextInt();
                
                String doctorName;
                Patient patient = null;
                int counter = 0;

                
                // loop 1, to search if the patient ID exists 
                for (int i = 0; i < personArraySize; i++) {
                    // a counter to count if the loop went throgh the whole array
                    counter++;

                    // if the patient ID in the array equals the patient ID we read then its found
                    if (HPerson.get(i).getId() == patientID) {
                        patient = (Patient) HPerson.get(i);
                        // get the patient and break from the loop to go to the next one
                        break; 
                    }

                    // if the loop went throgh the whole array and the counter equals the length of the loop then the ID is not found
                    if (counter == personArraySize) {
                        output.println("Command Assign_Doctor_Patient:");
                        output.println("Patient " + patientID + " NOT FOUND ");
                        output.println("-------------------------------------------------------------------------------");
                        break;
                    }
                    
                } // Loop 1 END
                
                
                counter =0;
                
                
                // loop 2, to search if the doctor exists and assgin doctor to patient if found
                 for (int i = 0; i < personArraySize; i++) {
                     // a counter to count if the loop went throgh the whole array
                     counter++;
                     
                    // if the doctor ID in the array equals the doctor ID we have read then its found 
                    if (HPerson.get(i).getId() == doctorID) {
                        Doctor doctor = (Doctor) HPerson.get(i);
                        doctorName = doctor.getName();
                        // get the doctor 
                        
                        
                        // if the patient is null then break from the loop. we cant assgin doctor when there is no patient
                        if (patient == null){
                            break;
                        }
                        
                        // assgin doctor to patient
                        patient.setDoctor(doctor);
                        
                            // print details 
                            output.println("Command Assign_Doctor_Patient:");
                            output.println("Successfully Processed by the System:");
                            output.println("Following are the details:");
                            output.println("\t\tPatient: " + patient.getName());
                            output.println("\t\tAssigned to Doctor: " + doctorName);
                            output.println("-------------------------------------------------------------------------------");
                            break;
            
                    }
                    
                    // if the loop went throgh the whole array and the counter equals the length of the loop then the ID is not found 
                     if (counter == personArraySize) {
                            output.println("Command Assign_Doctor_Patient:");
                            output.println("Doctor " + doctorID + " NOT FOUND ");
                            output.println("-------------------------------------------------------------------------------");
                           break;  
                        }
                } // loop 2 END


            }

            
           //----------------------------------------------------- 
            if (command.equalsIgnoreCase("Assign_Room_Patient")) {

                // read room number and patient ID from input file
                int roomNo = input.nextInt();
                int idPatient = input.nextInt();

                Patient patient=null;
                int counter = 0;

                
                // loop 1, to search if the patient ID exists 
                for (int j = 0; j < personArraySize; j++) {
                    counter++;
                    
                   // if the patient ID in the array equals the patient ID we read then its found 
                    if (HPerson.get(j).getId() == idPatient) {
                        patient = (Patient) HPerson.get(j);
                        break; 

                    }
                    
                    // if the loop went throgh the whole array and the counter equals the length of the loop then the ID is not found
                      if (counter == personArraySize) {
                        output.println("Command Assign_Room_Patient:");
                        output.println("Patient " + idPatient + " NOT FOUND ");
                        output.println("---------------------------------------------------------------------------------");
                        break;
                    }
                    
                } // loop 1 END
                
                counter =0;
                
                
                // loop 2, to search if the room number exists and assgin room to patient if found
                for (int i = 0; i < roomsArraySize; i++) {
                    counter ++;
                    
                   // if the room number in the array list equals the room number we read from the input file then its found
                    if (HRooms.get(i).getRoomNo() == roomNo) { 
                        Room room = HRooms.get(i);
                        
                       // if the patient equlas to null then break from the loop, cant assgin room if patient null 
                        if (patient == null){
                        
                           break;
                        }
              
                        // set room to patient
                        patient.setRoom(room);
                        
                           // print details
                            output.println("Command Assign_Room_Patient:");
                            output.println("Successfully Processed by the System:");
                            output.println("Following are the details:");
                            output.println("\tPatient: " + patient.getName());
                            output.println("\tAssigned to Room:\t" + "Room No: " + patient.getRoom().getRoomNo());
                            output.println("\tLocated in floor: " + patient.getRoom().getFloor());
                            output.println("\tBlock :" + patient.getRoom().getBlock());
                            output.printf("\tCharges: RM %.2f",patient.getRoom().getCharges());
                            output.println("");
                            output.println("---------------------------------------------------------------------------------");
                            break;
                        
                         }  
                    
                      // if the counter equals the length of the loop, that means it went through the whole array list and room number is not found
                        if (counter == roomsArraySize) {
                            output.println("Command Assign_Room_Patient:");
                            output.println("Room " + roomNo + " NOT FOUND ");
                            output.println("---------------------------------------------------------------------------------");
                            break;
                        }  
                } // loop 2 END

            }

            
            
           //--------------------------------------------------------- 
            if (command.equalsIgnoreCase("Assign_Medicine_Patient")) {

                // read patient ID, total of medicines and medcine codes from input file
                int idPatient = input.nextInt();
                int size = input.nextInt();
                int medicineCode = 0;
                
                medicine = new Medicine[size];
          
                Patient patient;
                int counter;
                int counter2;
                
                // loop 1, to search for medicine code
                for (int j = 0; j < medicine.length; j++) {

                    medicineCode = input.nextInt();

                    for (int i = 0; i < medicineArraySize; i++) {

                        // if the medicine code in the array list equals to the medicine code we read then its found
                        if (HMedicines.get(i).getMedicineCode() == medicineCode) {
                            medicine[j] = HMedicines.get(i);
                            break;
                        }

                    }

                } // loop 1 END

                counter = 0;
                counter2 = 0;

                // loop 2, to search for patient ID and assgin medicine if its found
                for (int i = 0; i < personArraySize; i++) {
                    counter++;
                    
                    // if the patient ID in the array equals the patient ID we read then its found 
                    if (HPerson.get(i).getId() == idPatient) {
                        patient = (Patient) HPerson.get(i);

                           // check if the total medicine in the array list equals to the total medicine we read
                            if (patient.getTotalMedicine() != size) {
                                output.println("ommand Assign_Medicine_Patient:");
                                output.println("Information mismatch: Patient " + idPatient + "must have " + patient.getTotalMedicine() + " medicine not " + size);
                                output.println("-----------------------------------------------------------------------------");
                                break;
                            }
                            
                           // loop 3, to set medicine and check if its not null to print details 
                            for (int j = 0; j < medicine.length; j++) {

                            // set medicine to patient    
                            Medicine medicinetemp = medicine[j];
                            patient.setMedicine(medicinetemp, j);

                            // if the medicine code dose not equal null then print details
                            if (patient.getMedicine(j) != null) {
                                counter2++;

                                // but it have to go through the whole array to make sure that every code medicine dose not equal null
                                if (counter2 == medicine.length) {
                                    output.println("Command Assign_Medicine_Patient:");
                                    output.println("Successfully Processed by the System:");
                                    output.println("Following are the details:");
                                    output.println("\tPatient: " + patient.getName());

                                    for (int a = 0; a < patient.getTotalMedicine(); a++) {
                                        output.println("\tMedicine Prescribed: " + patient.getMedicine(a).getName());
                                    }

                                    output.println("-----------------------------------------------------------------------------");
                                    break;
                                }

                            }

                            // if medicine code equals null then its not found
                            if (patient.getMedicine(j) == null) {
                                output.println("Command Assign_Medicine_Patient:");
                                output.println("Medicines " + medicineCode + " NOT FOUND ");
                                output.println("-----------------------------------------------------------------------------");
                                break;
                            }

                        } // loop 3 END
                        break;
                    }

                    // if the loop went throgh the whole array and the counter equals the length of the loop then the ID is not found
                    if (counter == personArraySize) {

                        output.println("Command Assign_Medicine_Patient:");
                        output.println("Patient " + idPatient + " NOT FOUND ");
                        output.println("-----------------------------------------------------------------------------");
                        break;
                    }

                }// loop 2 END

            }
            
            
           //--------------------------------------------
            if (command.equalsIgnoreCase("Print_Bill")) {
                DecimalFormat df = new DecimalFormat("#.00");
              // loop 1 to add the patients objects to a new array list
                for (int i = 0; i < personArraySize; i++) {

                    if (HPerson.get(i) instanceof Patient) {

                        patients.add((Patient) HPerson.get(i));

                    }
                } // loop 1 END

           // collection class to sort objects depending on the ID of the patients      
           Collections.sort(patients, (Patient p1, Patient p2) -> Integer.valueOf(p1.getId()).compareTo(p2.getId()));

           // print details
            output.println();
            output.println("Command: Print_Bill");
            output.println();
            output.println();
            output.println();
            output.println("--------------- Welcome to KAU Hospital System ---------------");
            output.println();
            Date date = new Date();
            output.println("--------- Current Date :  " + date + "--------");
            output.println();
            output.println("==================================================================");

            int patientsArraySize = patients.size();

            
            // loop 2 to print Patients array list
            for (int i = 0; i < patientsArraySize; i++) {  
                
                output.println("Patient Detail: ");
                output.println(" ID: " + patients.get(i).getId() + " Name: " + patients.get(i).getName());
                output.println("\tDoctor : " + patients.get(i).getDoctor().getName() + "   Doctor Consultation Fees: RM " + df.format(patients.get(i).getDoctor().getConsultationFees()));
                output.println("\tMedicines  are:");
                
                for (int j = 0; j < patients.get(i).getTotalMedicine(); j++) {
                    output.printf("%s%s%s","\tMedicine name: " , patients.get(i).getMedicine(j).getName() + "   \t" , "Price: RM " + df.format(patients.get(i).getMedicine(j).getPrice()));
                    output.println();
                    
                }
                output.println("\tRoom: " + patients.get(i).getRoom().getRoomNo() + " Room Charge: RM " + df.format(patients.get(i).getRoom().getCharges()));
                output.println("\t\t==== Total Charges : RM " + df.format(patients.get(i).calTotalBill()) + " ====");
                output.println("----------------------------------------------------------------");
                
            } // loop 2 END
            
            output.print("Thank you for using KAU Hospital System, Good Bye!");
        
            }
            
            command = input.next();
    

        }while (!command.equalsIgnoreCase ("Quit"));

        
    // OUTPUT CLOSE    
    output.close ();
    
    
}

}