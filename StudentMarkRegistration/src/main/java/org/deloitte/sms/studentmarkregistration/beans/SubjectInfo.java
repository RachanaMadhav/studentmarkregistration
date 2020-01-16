package org.deloitte.sms.studentmarkregistration.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="SUBJECT_INFO")
@Component
public class SubjectInfo {
	@Id
	@Column(name="CATEGORY",length=2)
	private String category;
	@Column
	private String subjectname;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
}
