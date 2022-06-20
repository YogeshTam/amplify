package com.capgemini;

public class Student {
	private int Stdid;
	private String StdName;
	public int getStdid() {
		return Stdid;
	}
	public void setStdid(int stdid) {
		Stdid = stdid;
	}
	public String getStdName() {
		return StdName;
	}
	public void setStdName(String stdName) {
		StdName = stdName;
	}
	public Student(int stdid, String stdName) {
		super();
		Stdid = stdid;
		StdName = stdName;
	}
	

}
