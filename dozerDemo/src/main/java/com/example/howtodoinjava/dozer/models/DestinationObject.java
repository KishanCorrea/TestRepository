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
public class DestinationObject {
	
	/*private String name;
	private String address;
	List<StudentVO> pupils;

	public List<StudentVO> getPupils() {
		if(pupils == null) {
			pupils = new ArrayList<StudentVO>();
		}
		return pupils;
	}*/
	String name;
	String address;
	String batch;
	String year;

}

