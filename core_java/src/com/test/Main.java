package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	transient Integer id;
	String name;

	public Student(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}

public class Main {
	public static void main(String[] args) throws IOException {
//		FileOutputStream stream = new FileOutputStream("student.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(stream);
		FileInputStream stream = new FileInputStream("student.txt");
		ObjectInputStream oos = new ObjectInputStream(stream);
		try (stream; oos;) {
			Student s1 = new Student(100, "Raju");

			Student student = (Student) oos.readObject();
			System.out.println(student);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
