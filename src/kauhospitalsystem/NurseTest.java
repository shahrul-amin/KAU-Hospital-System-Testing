package kauhospitalsystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NurseTest {



    @Test
    public void TC_04_001() {
        String expected_output = "Invalid nurse ID";
        String actual_output = KAUHospitalSystem.addNurse(7999, 'F');

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_04_002() {
        String expected_output = "Invalid nurse ID";
        String actual_output = KAUHospitalSystem.addNurse(7999, 'M');

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_04_003() {
        String expected_output = "Invalid nurse ID";
        String actual_output = KAUHospitalSystem.addNurse(7999, 'G');

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_04_004() {
        String expected_output = "Nurse successfully added";
        String actual_output = KAUHospitalSystem.addNurse(8000, 'F');

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_04_005() {
        String expected_output = "Nurse successfully added";
        String actual_output = KAUHospitalSystem.addNurse(8000, 'M');

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_04_006() {
        String expected_output = "Invalid gender";
        String actual_output = KAUHospitalSystem.addNurse(8000, 'O');

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_04_007() {
        String expected_output = "Nurse successfully added";
        String actual_output = KAUHospitalSystem.addNurse(8001, 'F');

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_04_008() {
        String expected_output = "Nurse successfully added";
        String actual_output = KAUHospitalSystem.addNurse(8001, 'M');

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_04_009() {
        String expected_output = "Invalid gender";
        String actual_output = KAUHospitalSystem.addNurse(8001, 'A');

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_04_010() {
        String expected_output = "Nurse successfully added";
        String actual_output = KAUHospitalSystem.addNurse(9998, 'F');

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_04_011() {
        String expected_output = "Nurse successfully added";
        String actual_output = KAUHospitalSystem.addNurse(9998, 'M');

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_04_012() {
        String expected_output = "Invalid gender";
        String actual_output = KAUHospitalSystem.addNurse(9998, 'B');

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_04_013() {
        String expected_output = "Nurse successfully added";
        String actual_output = KAUHospitalSystem.addNurse(9999, 'F');

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_04_014() {
        String expected_output = "Nurse successfully added";
        String actual_output = KAUHospitalSystem.addNurse(9999, 'M');

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_04_015() {
        String expected_output = "Invalid gender";
        String actual_output = KAUHospitalSystem.addNurse(9999, 'K');

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_04_016() {
        String expected_output = "Invalid nurse ID";
        String actual_output = KAUHospitalSystem.addNurse(10000, 'F');

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_04_017() {
        String expected_output = "Invalid nurse ID";
        String actual_output = KAUHospitalSystem.addNurse(10000, 'M');

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_04_0018() {
        String expected_output = "Invalid nurse ID";
        String actual_output = KAUHospitalSystem.addNurse(10000, 'Y');

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_04_019() {
        String expected_output = "Invalid nurse ID";
        String actual_output = KAUHospitalSystem.addNurse(9, 'L');

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_04_020() {
        String expected_output = "Invalid nurse ID";
        String actual_output = KAUHospitalSystem.addNurse(10025, 'C');

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_04_021() {
        String expected_output = "Nurse successfully added";
        String actual_output = KAUHospitalSystem.addNurse(9412, 'M');

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_04_022() {
        String expected_output = "Invalid nurse ID";
        String actual_output = KAUHospitalSystem.addNurse(325125, 'F');

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_04_023() {
        String expected_output = "Invalid gender";
        String actual_output = KAUHospitalSystem.addNurse(8156, 'B');

        assertEquals(expected_output, actual_output);
    }
    
    
    
    
}
