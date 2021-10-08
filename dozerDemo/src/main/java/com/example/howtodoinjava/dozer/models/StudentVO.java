package com.example.howtodoinjava.dozer.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentVO {

	String name;
	String batchName;
	String batchYear;
	AddressVO addressVO;
}