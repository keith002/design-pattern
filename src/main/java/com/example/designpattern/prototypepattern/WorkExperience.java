package com.example.designpattern.prototypepattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WorkExperience implements Serializable {

    private String workDate;
    private String company;

}
