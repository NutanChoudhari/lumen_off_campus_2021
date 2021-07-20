package demo;

import java.util.Arrays;

public class Student {
	private int rollNo;
	private String studName;
	private int[] marks;
	
	protected Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected Student(int rollNo, String studName, int[] marks) {
		this.rollNo = rollNo;
		this.studName = studName;
		this.marks = marks;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studName=" + studName + ", marks=" + Arrays.toString(marks) + "]";
	}
	
}
