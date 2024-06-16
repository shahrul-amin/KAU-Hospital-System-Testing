package kauhospitalsystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PatientTest {

    @Test
    public void TC_02_001() {
        String expected_output = "Invalid patient ID";
        String actual_output = KAUHospitalSystem.addPatient(999,"");

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_02_002() {
        String expected_output = "Invalid patient ID";
        String actual_output = KAUHospitalSystem.addPatient(999,"Fever");

        assertEquals(expected_output, actual_output);
    }
    
    
    @Test
    public void TC_02_003() {
        String expected_output = "Illness cannot be null";
        String actual_output = KAUHospitalSystem.addPatient(1000,"");

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_02_004() {
        String expected_output = "Patient successfully added";
        String actual_output = KAUHospitalSystem.addPatient(1000,"Flu");

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_02_005() {
    	String expected_output = "Illness cannot be null";
        String actual_output = KAUHospitalSystem.addPatient(1001,"");

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_02_006() {
    	String expected_output = "Patient successfully added";
        String actual_output = KAUHospitalSystem.addPatient(1001,"Cold");

        assertEquals(expected_output, actual_output);
    }
    

    @Test
    public void TC_02_007() {
    	String expected_output = "Illness cannot be null";
        String actual_output = KAUHospitalSystem.addPatient(3998,"");

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_02_008() {
    	String expected_output = "Patient successfully added";
        String actual_output = KAUHospitalSystem.addPatient(3998,"Fever");

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_02_009() {
    	String expected_output = "Illness cannot be null";
        String actual_output = KAUHospitalSystem.addPatient(3999,"");

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_02_010() {
    	String expected_output = "Patient successfully added";
        String actual_output = KAUHospitalSystem.addPatient(3999,"Flu");

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_02_011() {
        String expected_output = "Invalid patient ID";
        String actual_output = KAUHospitalSystem.addPatient(4000,"");

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_02_012() {
    	String expected_output = "Invalid patient ID";
        String actual_output = KAUHospitalSystem.addPatient(4000,"Flu");

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_02_013() {
    	String expected_output = "Invalid patient ID";
        String actual_output = KAUHospitalSystem.addPatient(560,"");

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_02_014() {
    	String expected_output = "Invalid patient ID";
        String actual_output = KAUHospitalSystem.addPatient(5678,"constipation");

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_02_015() {
    	String expected_output = "Patient successfully added";
        String actual_output = KAUHospitalSystem.addPatient(1234,"Flu");

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_02_016() {
    	String expected_output = "Invalid patient ID";
        String actual_output = KAUHospitalSystem.addPatient(567,"stomach ache");

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_02_017() {
    	String expected_output = "Illness cannot be null";
        String actual_output = KAUHospitalSystem.addPatient(3099,"");

        assertEquals(expected_output, actual_output);
    } 
}
