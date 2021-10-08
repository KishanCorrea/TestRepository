package com.example.howtodoinjava.dozer.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SourceObject {

	private String name;
	private String address;
	List<Student> students;
	
	public List<Student> getStudents() {
		if(students == null) {
			students = new ArrayList<Student>();
		}
		return students;
	}
}


