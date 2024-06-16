package kauhospitalsystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {

    @Test
    public void TC_05_001() {
        String expected_output = "Invalid room number";
        String actual_output = KAUHospitalSystem.addRoom(000, 99.99);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_05_002() {
        String expected_output = "Invalid room number";
        String actual_output = KAUHospitalSystem.addRoom(000, 100.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_05_003() {
        String expected_output = "Invalid room number";
        String actual_output = KAUHospitalSystem.addRoom(000, 100.01);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_004() {
        String expected_output = "Invalid room number";
        String actual_output = KAUHospitalSystem.addRoom(000, 1999.99);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_05_005() {
        String expected_output = "Invalid room number";
        String actual_output = KAUHospitalSystem.addRoom(000, 2000.00);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_05_006() {
        String expected_output = "Invalid room number";
        String actual_output = KAUHospitalSystem.addRoom(000, 2000.01);

        assertEquals(expected_output, actual_output);
    }
    
    @Test
    public void TC_05_007() {
        String expected_output = "Invalid charges";
        String actual_output = KAUHospitalSystem.addRoom(001, 99.99);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_008() {
        String expected_output = "Room successfully added";
        String actual_output = KAUHospitalSystem.addRoom(001, 100.00);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_009() {
        String expected_output = "Room successfully added";
        String actual_output = KAUHospitalSystem.addRoom(001, 100.01);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_010() {
        String expected_output = "Room successfully added";
        String actual_output = KAUHospitalSystem.addRoom(001, 1999.99);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_011() {
        String expected_output = "Room successfully added";
        String actual_output = KAUHospitalSystem.addRoom(001, 2000.00);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_012() {
        String expected_output = "Invalid charges";
        String actual_output = KAUHospitalSystem.addRoom(001, 2000.01);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_013() {
        String expected_output = "Invalid charges";
        String actual_output = KAUHospitalSystem.addRoom(002, 99.99);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_014() {
        String expected_output = "Room successfully added";
        String actual_output = KAUHospitalSystem.addRoom(002, 100.00);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_015() {
        String expected_output = "Room successfully added";
        String actual_output = KAUHospitalSystem.addRoom(002, 100.01);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_016() {
        String expected_output = "Room successfully added";
        String actual_output = KAUHospitalSystem.addRoom(002, 1999.99);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_017() {
        String expected_output = "Room successfully added";
        String actual_output = KAUHospitalSystem.addRoom(002, 2000.00);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_018() {
        String expected_output = "Invalid charges";
        String actual_output = KAUHospitalSystem.addRoom(002, 2000.01);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_019() {
        String expected_output = "Invalid charges";
        String actual_output = KAUHospitalSystem.addRoom(398, 99.99);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_020() {
        String expected_output = "Room successfully added";
        String actual_output = KAUHospitalSystem.addRoom(398, 100.00);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_021() {
        String expected_output = "Room successfully added";
        String actual_output = KAUHospitalSystem.addRoom(398, 100.01);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_022() {
        String expected_output = "Room successfully added";
        String actual_output = KAUHospitalSystem.addRoom(398, 1999.99);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_023() {
        String expected_output = "Room successfully added";
        String actual_output = KAUHospitalSystem.addRoom(398, 2000.00);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_024() {
        String expected_output = "Invalid charges";
        String actual_output = KAUHospitalSystem.addRoom(398, 2000.01);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_025() {
        String expected_output = "Invalid charges";
        String actual_output = KAUHospitalSystem.addRoom(399, 99.99);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_026() {
        String expected_output = "Room successfully added";
        String actual_output = KAUHospitalSystem.addRoom(399, 100.00);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_027() {
        String expected_output = "Room successfully added";
        String actual_output = KAUHospitalSystem.addRoom(399, 100.01);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_028() {
        String expected_output = "Room successfully added";
        String actual_output = KAUHospitalSystem.addRoom(399, 1999.99);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_029() {
        String expected_output = "Room successfully added";
        String actual_output = KAUHospitalSystem.addRoom(399, 2000.00);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_030() {
        String expected_output = "Invalid charges";
        String actual_output = KAUHospitalSystem.addRoom(399, 2000.01);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_031() {
        String expected_output = "Invalid room number";
        String actual_output = KAUHospitalSystem.addRoom(400, 99.99);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_032() {
        String expected_output = "Invalid room number";
        String actual_output = KAUHospitalSystem.addRoom(400, 100.00);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_033() {
        String expected_output = "Invalid room number";
        String actual_output = KAUHospitalSystem.addRoom(400, 100.01);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_034() {
        String expected_output = "Invalid room number";
        String actual_output = KAUHospitalSystem.addRoom(400, 1999.99);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_035() {
        String expected_output = "Invalid room number";
        String actual_output = KAUHospitalSystem.addRoom(400, 2000.00);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_036() {
        String expected_output = "Invalid room number";
        String actual_output = KAUHospitalSystem.addRoom(400, 2000.01);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_037() {
        String expected_output = "Invalid room number";
        String actual_output = KAUHospitalSystem.addRoom(000, 0);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_038() {
        String expected_output = "Invalid room number";
        String actual_output = KAUHospitalSystem.addRoom(400, 0);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_039() {
        String expected_output = "Room successfully added";
        String actual_output = KAUHospitalSystem.addRoom(399, 2000.00);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_040() {
        String expected_output = "Invalid room number";
        String actual_output = KAUHospitalSystem.addRoom(400, 2000.00);

        assertEquals(expected_output, actual_output);
    }

    @Test
    public void TC_05_041() {
        String expected_output = "Invalid charges";
        String actual_output = KAUHospitalSystem.addRoom(399, 2000.01);

        assertEquals(expected_output, actual_output);
    }
}
