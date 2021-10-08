package com.example.howtodoinjava.dozer.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AddressVO {
    String voCity;
    String voState;
    String voCountry;
}
