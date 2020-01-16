package org.deloitte.sms.studentmarkregistration.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="STUDENT_MARK_SECONDARY")
@Component
public class StudentMarkSecondary {
	@Id
	private int studentid;
	@Column(name="ENGLISH_MARK")
	private int english;
	@Column(name="HINDI_MARK")
	private int hindi;
	@Column(name="SCIENCE_MARK")
	private int science;
	@Column(name="SOCIAL_MARK")
	private int social;
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
	public int getHindi() {
		return hindi;
	}
	public void setHindi(int hindi) {
		this.hindi = hindi;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getSocial() {
		return social;
	}
	public void setSocial(int social) {
		this.social = social;
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
