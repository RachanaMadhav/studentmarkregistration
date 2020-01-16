package org.deloitte.sms.studentmarkregistration.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="STUDENT_MARK_HIGHER")
@Component
public class StudentMarkHigher {
	@Id
	private int studentid;
	@Column(name="ENGLISH_MARK")
	private int english;
	@Column(name="TAMIL_MARK")
	private int tamil;
	@Column(name="PHYSICS_MARK")
	private int physics;
	@Column(name="CHEMISTRY_MARK")
	private int chemistry;
	@Column(name="COMPUTER_MARK")
	private int computer;
	@Column(name="MATHS_MARK")
	private int maths;
	@Column(name="TOTAL_MARK")
	private int total;
	@Column(name="AVERAGE_MARK")
	private double average;
	@Column(name="GRADE")
	private String grade;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getTamil() {
		return tamil;
	}
	public void setTamil(int tamil) {
		this.tamil = tamil;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public int getComputer() {
		return computer;
	}
	public void setComputer(int computer) {
		this.computer = computer;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

		
	}

