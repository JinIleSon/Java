package test7.sub01;

import java.util.ArrayList;
import java.util.List;

class Doctor {
	private String name;
	private String id;
	private String special;
	private List<Patient> patients;
	public Doctor(String name, String id, String special) {
		this.name = name;
		this.id = id;
		this.special = special;
		this.patients = new ArrayList<Patient>();
	}
	
	public void addPatient(Patient patient) {
		patients.add(patient);
	}

	@Override
	public String toString() {
		return ("의사: " + name + "(ID: " + id + ", 전문분야: " + special + ")" + "\n담당 환자 목록:\n" + 
				patients).replace("[-", "-").replace(", -", "\n-").replace("]]", "]\n");
	}
	
	
}

