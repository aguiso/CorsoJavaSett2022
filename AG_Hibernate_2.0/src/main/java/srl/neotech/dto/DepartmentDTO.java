package srl.neotech.dto;

public class DepartmentDTO {
	
	private String personName;
	private String departmentName;
	
	public DepartmentDTO(String personName, String departmentName) {
		super();
		this.personName = personName;
		this.departmentName = departmentName;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	
	
}
