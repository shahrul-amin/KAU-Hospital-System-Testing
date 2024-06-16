package kauhospitalsystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DoctorTest {

	@Test
	public void TC_01_001() {
		String expected_output = "Invalid doctor ID";
		String actual_output = KAUHospitalSystem.addDoctor(4999, 'F');
		
		assertEquals(expected_output, actual_output);
	}
	
	@Test
	public void TC_01_002() {
		String expected_output = "Invalid doctor ID";
		String actual_output = KAUHospitalSystem.addDoctor(4999, 'M');
		
		assertEquals(expected_output, actual_output);
	}
	
	@Test
	public void TC_01_003() {
		String expected_output = "Invalid doctor ID";
		String actual_output = KAUHospitalSystem.addDoctor(4999, 'G');
		
		assertEquals(expected_output, actual_output);
	}
	
	@Test
	public void TC_01_004() {
		String expected_output = "Doctor successfully added";
		String actual_output = KAUHospitalSystem.addDoctor(5000, 'F');
		
		assertEquals(expected_output, actual_output);
	}
	
	@Test
	public void TC_01_005() {
		String expected_output = "Doctor successfully added";
		String actual_output = KAUHospitalSystem.addDoctor(5000, 'M');
		
		assertEquals(expected_output, actual_output);
	}
	
	@Test
	public void TC_01_006() {
		String expected_output = "Invalid gender";
		String actual_output = KAUHospitalSystem.addDoctor(5000, 'G');
		
		assertEquals(expected_output, actual_output);
	}
	
	@Test
	public void TC_01_007() {
		String expected_output = "Doctor successfully added";
		String actual_output = KAUHospitalSystem.addDoctor(5001, 'F');
		
		assertEquals(expected_output, actual_output);
	}
	
	@Test
	public void TC_01_008() {
		String expected_output = "Doctor successfully added";
		String actual_output = KAUHospitalSystem.addDoctor(5001, 'M');
		
		assertEquals(expected_output, actual_output);
	}
	
	@Test
	public void TC_01_009() {
		String expected_output = "Invalid gender";
		String actual_output = KAUHospitalSystem.addDoctor(5001, 'G');
		
		assertEquals(expected_output, actual_output);
	}
	
	@Test
	public void TC_01_010() {
		String expected_output = "Doctor successfully added";
		String actual_output = KAUHospitalSystem.addDoctor(7998, 'F');
		
		assertEquals(expected_output, actual_output);
	}
	
	@Test
	public void TC_01_011() {
		String expected_output = "Doctor successfully added";
		String actual_output = KAUHospitalSystem.addDoctor(7998, 'M');
		
		assertEquals(expected_output, actual_output);
	}
	
	@Test
	public void TC_01_012() {
		String expected_output = "Invalid gender";
		String actual_output = KAUHospitalSystem.addDoctor(7998, 'G');
		
		assertEquals(expected_output, actual_output);
	}
	
	@Test
	public void TC_01_013() {
		String expected_output = "Doctor successfully added";
		String actual_output = KAUHospitalSystem.addDoctor(7999, 'F');
		
		assertEquals(expected_output, actual_output);
	}
	
	@Test
	public void TC_01_014() {
		String expected_output = "Doctor successfully added";
		String actual_output = KAUHospitalSystem.addDoctor(7999, 'M');
		
		assertEquals(expected_output, actual_output);
	}
	
	@Test
	public void TC_01_015() {
		String expected_output = "Invalid gender";
		String actual_output = KAUHospitalSystem.addDoctor(7999, 'G');
		
		assertEquals(expected_output, actual_output);
	}
	
	
	@Test
	public void TC_01_016() {
		String expected_output = "Invalid doctor ID";
		String actual_output = KAUHospitalSystem.addDoctor(8001, 'F');
		
		assertEquals(expected_output, actual_output);
	}
	
	@Test
	public void TC_01_017() {
		String expected_output = "Invalid doctor ID";
		String actual_output = KAUHospitalSystem.addDoctor(8001, 'M');
		
		assertEquals(expected_output, actual_output);
	}
	
	@Test
	public void TC_01_018() {
		String expected_output = "Invalid doctor ID";
		String actual_output = KAUHospitalSystem.addDoctor(8001, 'G');
		
		assertEquals(expected_output, actual_output);
	}
	
	@Test
	public void TC_01_019() {
		String expected_output = "Invalid doctor ID";
		String actual_output = KAUHospitalSystem.addDoctor(9, 'T');
		
		assertEquals(expected_output, actual_output);
	}
	
	@Test
	public void TC_01_020() {
		String expected_output = "Invalid doctor ID";
		String actual_output = KAUHospitalSystem.addDoctor(10005, 'D');
		
		assertEquals(expected_output, actual_output);
	}
	
	@Test
	public void TC_01_021() {
		String expected_output = "Doctor successfully added";
		String actual_output = KAUHospitalSystem.addDoctor(5001, 'F');
		
		assertEquals(expected_output, actual_output);
	}
	
	@Test
	public void TC_01_022() {
		String expected_output = "Invalid doctor ID";
		String actual_output = KAUHospitalSystem.addDoctor(4999, 'F');
		
		assertEquals(expected_output, actual_output);
	}
	
	@Test
	public void TC_01_023() {
		String expected_output = "Invalid gender";
		String actual_output = KAUHospitalSystem.addDoctor(5001, 'G');
		
		assertEquals(expected_output, actual_output);
	}

}
