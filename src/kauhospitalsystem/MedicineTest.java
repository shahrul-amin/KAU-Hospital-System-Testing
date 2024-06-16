package kauhospitalsystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MedicineTest {

    @Test
    public void TC_03_001() {
        String expected_output = "Invalid medicine code";
        String actual_output = KAUHospitalSystem.addMedicine(3999, 0.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_002() {
        String expected_output = "Invalid medicine code";
        String actual_output = KAUHospitalSystem.addMedicine(3999, 1.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_003() {
        String expected_output = "Invalid medicine code";
        String actual_output = KAUHospitalSystem.addMedicine(3999, 2.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_004() {
        String expected_output = "Invalid medicine code";
        String actual_output = KAUHospitalSystem.addMedicine(3999, 49.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_005() {
        String expected_output = "Invalid medicine code";
        String actual_output = KAUHospitalSystem.addMedicine(3999, 50.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_006() {
        String expected_output = "Invalid medicine code";
        String actual_output = KAUHospitalSystem.addMedicine(3999, 51.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_007() {
        String expected_output = "Invalid price";
        String actual_output = KAUHospitalSystem.addMedicine(4000, 0.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_008() {
        String expected_output = "Medicine successfully added";
        String actual_output = KAUHospitalSystem.addMedicine(4000, 1.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_009() {
        String expected_output = "Medicine successfully added";
        String actual_output = KAUHospitalSystem.addMedicine(4000, 2.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_0010() {
        String expected_output = "Medicine successfully added";
        String actual_output = KAUHospitalSystem.addMedicine(4000, 49.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_011() {
        String expected_output = "Medicine successfully added";
        String actual_output = KAUHospitalSystem.addMedicine(4000, 50.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_012() {
        String expected_output = "Invalid price";
        String actual_output = KAUHospitalSystem.addMedicine(4000, 51.00);

        assertEquals(expected_output, actual_output);
    }
 
    @Test
    public void TC_03_013() {
        String expected_output = "Invalid price";
        String actual_output = KAUHospitalSystem.addMedicine(4001, 0.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_014() {
        String expected_output = "Medicine successfully added";
        String actual_output = KAUHospitalSystem.addMedicine(4001, 1.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_015() {
        String expected_output = "Medicine successfully added";
        String actual_output = KAUHospitalSystem.addMedicine(4001, 2.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_0016() {
        String expected_output = "Medicine successfully added";
        String actual_output = KAUHospitalSystem.addMedicine(4001, 49.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_017() {
        String expected_output = "Medicine successfully added";
        String actual_output = KAUHospitalSystem.addMedicine(4001, 50.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_018() {
        String expected_output = "Invalid price";
        String actual_output = KAUHospitalSystem.addMedicine(4001, 51.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_019() {
        String expected_output = "Invalid price";
        String actual_output = KAUHospitalSystem.addMedicine(4513, 0.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_020() {
        String expected_output = "Medicine successfully added";
        String actual_output = KAUHospitalSystem.addMedicine(4513, 1.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_021() {
        String expected_output = "Medicine successfully added";
        String actual_output = KAUHospitalSystem.addMedicine(4513, 2.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_0022() {
        String expected_output = "Medicine successfully added";
        String actual_output = KAUHospitalSystem.addMedicine(4513, 49.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_023() {
        String expected_output = "Medicine successfully added";
        String actual_output = KAUHospitalSystem.addMedicine(4513, 50.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_024() {
        String expected_output = "Invalid price";
        String actual_output = KAUHospitalSystem.addMedicine(4513, 51.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_025() {
        String expected_output = "Invalid price";
        String actual_output = KAUHospitalSystem.addMedicine(4514, 0.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_026() {
        String expected_output = "Medicine successfully added";
        String actual_output = KAUHospitalSystem.addMedicine(4514, 1.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_027() {
        String expected_output = "Medicine successfully added";
        String actual_output = KAUHospitalSystem.addMedicine(4514, 2.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_028() {
        String expected_output = "Medicine successfully added";
        String actual_output = KAUHospitalSystem.addMedicine(4514, 49.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_029() {
        String expected_output = "Medicine successfully added";
        String actual_output = KAUHospitalSystem.addMedicine(4514, 50.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_030() {
        String expected_output = "Invalid price";
        String actual_output = KAUHospitalSystem.addMedicine(4514, 51.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_031() {
        String expected_output = "Invalid medicine code";
        String actual_output = KAUHospitalSystem.addMedicine(4515, 0.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_032() {
        String expected_output = "Invalid medicine code";
        String actual_output = KAUHospitalSystem.addMedicine(4515, 1.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_033() {
        String expected_output = "Invalid medicine code";
        String actual_output = KAUHospitalSystem.addMedicine(4515, 2.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_034() {
        String expected_output = "Invalid medicine code";
        String actual_output = KAUHospitalSystem.addMedicine(4515, 49.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_035() {
        String expected_output = "Invalid medicine code";
        String actual_output = KAUHospitalSystem.addMedicine(4515, 50.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_036() {
        String expected_output = "Invalid medicine code";
        String actual_output = KAUHospitalSystem.addMedicine(4515, 51.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_037() {
        String expected_output = "Invalid medicine code";
        String actual_output = KAUHospitalSystem.addMedicine(2000, 2.99);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_038() {
        String expected_output = "Invalid medicine code";
        String actual_output = KAUHospitalSystem.addMedicine(9909, 15.30);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_039() {
        String expected_output = "Medicine successfully added";
        String actual_output = KAUHospitalSystem.addMedicine(4201, 10.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_040() {
        String expected_output = "Invalid medicine code";
        String actual_output = KAUHospitalSystem.addMedicine(9017, 78.90);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_03_041() {
        String expected_output = "Invalid price";
        String actual_output = KAUHospitalSystem.addMedicine(4167, 1000.00);

        assertEquals(expected_output, actual_output);
    }
    
}
