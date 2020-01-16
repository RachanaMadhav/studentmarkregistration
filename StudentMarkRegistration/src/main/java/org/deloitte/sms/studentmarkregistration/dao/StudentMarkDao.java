package org.deloitte.sms.studentmarkregistration.dao;

import org.deloitte.sms.studentmarkregistration.beans.StudentMarkHigher;
import org.deloitte.sms.studentmarkregistration.beans.StudentMarkPrimary;
import org.deloitte.sms.studentmarkregistration.beans.StudentMarkSecondary;

public interface StudentMarkDao {
	public void addMarkPrimary(StudentMarkPrimary primary);
	public void addMarkSecondary(StudentMarkSecondary secondary);
	public void addMarkHigher(StudentMarkHigher higher);
	public String gradeCal(double avg);
	public String validationForPrimary(int a,int b,int c,int d);
	public String validationForSecondary(int a,int b,int c,int d,int e);
	public String validationForHigher(int a,int b,int c,int d,int e,int f);
}
