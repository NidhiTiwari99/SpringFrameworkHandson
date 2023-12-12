package mypackage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblstudent_details")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int rno;
	private String name;
	private String qualification;
	private Float percentage;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rno, String name, String qualification, Float percentage) {
		super();
		this.rno = rno;
		this.name = name;
		this.qualification = qualification;
		this.percentage = percentage;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Float getPercentage() {
		return percentage;
	}
	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}
}
