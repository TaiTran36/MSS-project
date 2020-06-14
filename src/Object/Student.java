package Object;

import java.util.Comparator;
import java.util.LinkedList;

import ObjInterface.UserInterface;

public class Student implements UserInterface, Comparator<Student>{

	
	private String name, code, dateOfBirth, address;
	private LinkedList<Course> room;
	
	
	public Student(String name, String code, String dateOfBirth, String address, LinkedList<Course> room ) {
		this.name = name;
		this.code = code;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.room = room;

	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public String getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}





	public LinkedList<Course> getRoom() {
		return room;
	}



	public void setRoom(LinkedList<Course>room) {
		this.room = room;
	}



	@Override
	public int login(String code, String password) {
		// TODO Auto-generated method stub
		return 0;
	}





	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
