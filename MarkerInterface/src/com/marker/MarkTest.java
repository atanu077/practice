package com.marker;

public class MarkTest {
	public static void main(String[] args) throws MarkNotSupportedException {
		Student s1=new Student(99);
		System.out.println(s1.sid);
		Student s2=s1.MyMark();
		System.out.println(s1==s2);
	}

}
class Student implements MarkerEntity{
	int sid;
	public Student(int sid) {

	this.sid=sid;
	}
	public Student MyMark() throws MarkNotSupportedException{
		if(this instanceof MarkerEntity)
		return new Student(sid);
		else
			throw new MarkNotSupportedException("Implemented MarkerEntity!!");
	}
}
