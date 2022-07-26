package com.timibolaji.Springboot.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    @NotBlank(message = "Please Enter Department Name")
    private String departmentName;
    @NotBlank(message = "Please Enter Department Address")
    private String departmentAddress;
    @NotBlank(message = "Please Enter Department Code")
    private String departmentCode;


    
}
