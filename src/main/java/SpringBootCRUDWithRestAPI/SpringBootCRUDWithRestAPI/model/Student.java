package SpringBootCRUDWithRestAPI.SpringBootCRUDWithRestAPI.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentstbl")
public class Student {
	@Id
	private int rno;
	private String name;
	private int english;
	private int math;
	private int science;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rno, String name, int english, int math, int science) {
		super();
		this.rno = rno;
		this.name = name;
		this.english = english;
		this.math = math;
		this.science = science;
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
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}

}
