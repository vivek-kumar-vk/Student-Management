package studentsmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int studentId;
	private String studentName;
	private long StudentNumber;
	private String studentCountry;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public long getStudentNumber() {
		return StudentNumber;
	}
	public void setStudentNumber(long studentNumber) {
		StudentNumber = studentNumber;
	}
	public String getStudentCountry() {
		return studentCountry;
	}
	public void setStudentCountry(String studentCountry) {
		this.studentCountry = studentCountry;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", StudentNumber=" + StudentNumber
				+ ", studentCountry=" + studentCountry + "]";
	}
	
	
	
//	private int studentClass;
//	private int studentRollnumber;
	
}
